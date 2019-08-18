/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ic.ac.uk.xdrone.xDrone.Fly
import ic.ac.uk.xdrone.xDrone.Command
import ic.ac.uk.xdrone.xDrone.Up
import ic.ac.uk.xdrone.xDrone.Left
import ic.ac.uk.xdrone.xDrone.Right
import ic.ac.uk.xdrone.xDrone.Wait
import java.io.PrintWriter
import java.io.IOException
import java.io.File
import ic.ac.uk.xdrone.xDrone.Move
import ic.ac.uk.xdrone.xDrone.Environment
import ic.ac.uk.xdrone.xDrone.Drone
import ic.ac.uk.xdrone.xDrone.Rotate
import ic.ac.uk.xdrone.xDrone.Main
import ic.ac.uk.xdrone.xDrone.GoTo

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XDroneGenerator extends AbstractGenerator {

	def compile(Environment environment)'''
	function environment()
	{
		//resets drone location
		drone.position.x = 0;
		drone.position.z = 0;
		drone.position.y = 0 + modelHeight;
		«FOR d : environment.drone»
			drone.position.x = «d.position.vector.x»
			drone.position.z = «d.position.vector.z»
			drone.position.y = «d.position.vector.y» + modelHeight
			«IF d.rotation !== null»
				currentDroneAngle += «d.rotation»;
				drone.rotateY(«d.rotation»  * (Math.PI/180));
			«ENDIF»
		«ENDFOR»
		«FOR d : environment.walls»
			drawWalls(«d.front.value», «d.right.value», «d.back.value», «d.left.value»,  «d.up.value»)
		«ENDFOR»
		«FOR ob : environment.objects»
«««			addCube("«ob.object_name»",«ob.sx», «ob.sy», «ob.sz», «ob.lx», «ob.ly», «ob.lz»)
			addCube("«ob.object_name»",«ob.size.vector.x», «ob.size.vector.y», «ob.size.vector.z», 
				«ob.origin.vector.x», «ob.origin.vector.y», «ob.origin.vector.z»,
			«IF ob.color !== null»
				"«ob.color.color_value»"
			«ENDIF»
			)
		«ENDFOR»
	}
	'''
	
	def compileJS(Fly fly)'''
		var commands = [];
		var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
		//var goalDroneLocation = currentDroneLocation;
		var goalDroneRotation = drone.rotation.y;
		var currentFunction = "";
		var finishSimulation = false;
		var destination = 0;

		//Drone's path
		var lineMaterial = new THREE.LineBasicMaterial({color: 0x1ACF10});
		var lineGeometry = new THREE.Geometry();
		lineGeometry.vertices.push(
			new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z)
		);
		//var lastX = drone.position.x, lastY = drone.position.y, lastZ = drone.position.z;
		«FOR to : fly.takeoff»
			commands.push("TAKEOFF");
			//commands.push({y: 0.7}); 
			//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY + 0.7, lastZ));
			//lastY += 0.7;
		«ENDFOR»
		
		//commands.push({w: 2}); 
		
		//commands.push({x: 2}); 
		//lineGeometry.vertices.push(new THREE.Vector3(lastX + 2, lastY, lastZ));
		//lastX += 2;
		
		«FOR f : fly.commands»
			«IF f instanceof Command»
				«f.compileJS»
			«ENDIF»
		«ENDFOR»
		
		
		//commands.push({r: 90 * (Math.PI/2)}); 
		//commands.push({r: 90}); 
								
		
		«FOR to : fly.land»
			//commands.push({y: -0.7}); 
			commands.push("LAND");
			//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY - 0.7, lastZ));
			//lastY -= 0.7;
		«ENDFOR»
		nextCommand();
		
		if(line)
			scene.remove( line );
		line = new THREE.Line( lineGeometry, lineMaterial );
		
		scene.add( line );
		function flySimulation(){
			if(!finishSimulation){
				if((currentFunction == "MOVE_Y" && fly(destination, 'y'))
					|| (currentFunction == "MOVE_X" && fly(destination, 'x'))
					|| (currentFunction == "MOVE_Z" && fly(destination, 'z'))
					|| (currentFunction == "LAND" && land())
					|| (currentFunction == "ROTATION" && rotation(goalDroneRotation))){
«««					console.log(currentFunction, collisionBox);
					nextCommand();
				}
			}
		}
		
		function nextCommand(){
			if(commands && commands[0]){
				if(commands[0].r !== undefined){
					changeDroneCollisionBox(getDistanceErrorFromAngle(commands[0].r),0,getDistanceErrorFromAngle(commands[0].r))
					goalDroneRotation = commands[0].r * (Math.PI/180);
					currentFunction = "ROTATION";
				}
				else if(commands[0].w !== undefined){
					execute = false;
					setTimeout(function () {
						execute = true;
					    }, (commands[0].w * 1000));
				}
				else if(commands[0].y !== undefined){
					destination = commands[0].y;
					currentFunction = "MOVE_Y";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				else if(commands[0].x !== undefined){
					changeDroneCollisionBox(0.6,0,0.6)
					destination = commands[0].x;
					currentFunction = "MOVE_X";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				else if(commands[0].z !== undefined){
					changeDroneCollisionBox(0.6,0,0.6)
					destination = commands[0].z;
					currentFunction = "MOVE_Z";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				else if(commands[0] == "TAKEOFF"){
					changeDroneCollisionBox(0.25,0,0.25)
					destination = 0.7;
					currentFunction = "MOVE_Y";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				else if(commands[0] == "LAND"){
					changeDroneCollisionBox(0.25,0,0.25)
					currentFunction = "LAND";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				else if(commands[0].flyTo !== undefined){
					
					var vector = getDistanceToObject(commands[0].flyTo);
					var angle = getRotationToObject(commands[0].flyTo);
					
					commands.shift();
					
					changeDroneCollisionBox(getDistanceErrorFromAngle(angle),0,getDistanceErrorFromAngle(angle))
					
					goalDroneRotation = angle * (Math.PI/180);
					currentFunction = "ROTATION";
					commands.unshift({z: vector.z}); 
					commands.unshift({y: vector.y}); 
					commands.unshift({r: angle});
				}
				commands.shift();
			}
			else{
				finishSimulation = true;	
			}
		}
		
		function getDistanceErrorFromAngle(angle){
			return 1.2 * angle /90
		}
	'''
	
	def compileJS(Command cmd) '''
	  	«IF cmd instanceof Move»
	  		if(«cmd.vector.y» != 0)
				commands.push({y: «cmd.vector.y»}); 
			if(«cmd.vector.z» != 0)	
				commands.push({z: «cmd.vector.z»});
			if(«cmd.vector.x» != 0)	 
				commands.push({x: «cmd.vector.x»}); 
	  	«ENDIF»
	  	«IF cmd instanceof Rotate»
			commands.push({r: «cmd.angle»}); 
	  	«ENDIF»
	  	«IF cmd instanceof Wait»
			commands.push({w: «cmd.seconds»});
	  	«ENDIF»
	  	«IF cmd instanceof GoTo»
			commands.push({flyTo: "«cmd.object_name»"});
	  	«ENDIF»
	'''
	

	def compilePython(Main main)'''
		#! /usr/bin/env python
		import sys
		sys.path.append('/opt/ros/indigo/lib/python2.7/dist-packages')
		import rospy
		import math  
		
		from std_msgs.msg import Empty
		from ardrone_autonomy.msg import Navdata	
		from geometry_msgs.msg import Twist	
		PI = 3.1415926535897
		
		state = -1
		dronePosition = {
			'x': 0,
			'y': 0,
			'z': 0
		}
		currentDroneAngle = 0
		
		«FOR d : main.environment.drone»
			dronePosition.x = «d.position.vector.z»
			dronePosition.z = «d.position.vector.y»
			dronePosition.y = «d.position.vector.x»
			«IF d.rotation !== null»
				currentDroneAngle += «d.rotation»
			«ENDIF»
		«ENDFOR»
		
		objects = {}
		
		«FOR ob : main.environment.objects»
			objects['«ob.object_name»'] = {
				'x': «ob.size.vector.z»,
				'y': «ob.size.vector.x»,
				'z': «ob.size.vector.y» + «ob.origin.vector.y»/2,
			}
		«ENDFOR»
		
		def getDistanceToObject(objectName):
			global objects
			obPosition = {}
			if objects[objectName]:
				obPosition = objects[objectName]
			
			if position['x'] && position['z']:
				x = math.abs(dronePosition['x'] - obPosition['x'])
				y = math.abs(dronePosition['y'] - obPosition['y'])
				
				return {
					'x': math.sqrt( x*x + y*y ),
					'z': getDistance(dronePosition['z'], obPosition['z'])
				}
			else:
				return {'x': 0, 'z': 0}
				
				
		def getDistance(dronePos, obPos):
		  if(dronePos > obPos)
		    return - math.abs(dronePos - obPos);
		  else
		    return math.abs(dronePos - obPos);
		
		
		def getRotationToObject(objectName):
			global objects
			obPosition = {}
			if objects[objectName]:
				obPosition = objects[objectName]
			
			if position['x'] && position['z']:
				angleToObject = math.atan2(dronePosition['x'] - obPosition['x'], dronePosition['y'] - obPosition['y']) * 180 / math.pi
				
			    angleToObject = angleTo360(angleToObject)
			    isPositive = true;
			    if currentDroneAngle > angleToObject:
			      isPositive = False
			
			    angleToObject = math.abs(currentDroneAngle - angleToObject)
			    ifangleToObject > 180:
			      angleToObject = 360 - angleToObject;
			      isPositive = !isPositive;
			
			    return (isPositive ? angleToObject : -angleToObject)
			else:
				return 0
		
		def angleTo360(angle):
		  while angle < 0:
		    angle = 360 + angle
		  return angle
		
		
		def checkAngle(angle):
		  angle = angle%360
		  while angle < 0:
		    angle = 360 + angle;
		  return angle
		
		
		def ReceiveNavdata(data):
			global state
			state = data.state
			
		def rotate(speed, angle, clockwise):
			vel_msg = Twist()
			velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
		
			angular_speed = speed*PI/360
			relative_angle = angle*PI/360
		
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			vel_msg.linear.z=0
			vel_msg.angular.x = 0
			vel_msg.angular.y = 0
		
			if clockwise:
				vel_msg.angular.z = -abs(angular_speed)
			else:
				vel_msg.angular.z = abs(angular_speed)
		
			t0 = rospy.Time.now().to_sec()
			current_angle = 0
		
			while velocity_publisher.get_num_connections() < 1:
				rospy.sleep(0.1)
		
			while(current_angle < relative_angle):
				velocity_publisher.publish(vel_msg)
				t1 = rospy.Time.now().to_sec()
				current_angle = angular_speed*(t1-t0)
		
			vel_msg.angular.z = 0
			velocity_publisher.publish(vel_msg)
		
		
		#direction (true)- forward, left, up
		def move(speed, distance, direction, axis): 
			vel_msg = Twist()
			velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
		
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			vel_msg.linear.z=0
			vel_msg.angular.x = 0
			vel_msg.angular.y = 0
			vel_msg.angular.z = 0
		
			if axis == "x":
				if direction:
					vel_msg.linear.x = abs(speed)
				else:
					vel_msg.linear.x = -abs(speed)
			elif axis == "y":
				if direction:
					vel_msg.linear.y = abs(speed)
				else:
					vel_msg.linear.y = -abs(speed)
			elif axis == "z":
				if direction:
					vel_msg.linear.z = abs(speed)
				else:
					vel_msg.linear.z = -abs(speed)
		
		
			while velocity_publisher.get_num_connections() < 1:
				rospy.sleep(0.1)
		
			t0 = rospy.Time.now().to_sec()
			current_distance = 0
		
			while(current_distance < distance):
				velocity_publisher.publish(vel_msg)
				t1 = rospy.Time.now().to_sec()
				current_distance = speed*(t1-t0)
		
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			vel_msg.linear.z=0
			velocity_publisher.publish(vel_msg)
				
		
		rospy.init_node('test_node')
		empty = Empty()
		rospy.Subscriber('/ardrone/navdata', Navdata, ReceiveNavdata)
		
		while state == -1:
			rospy.sleep(0.1)
		
		if state == 0:
			reset = rospy.Publisher('/ardrone/reset', Empty, queue_size=1)
			while reset.get_num_connections() < 1:
				rospy.sleep(0.1)
			reset.publish(empty)
		
		while state == 0:
			rospy.sleep(0.1)
		
		«FOR to : main.fly.takeoff»  
			takeoff = rospy.Publisher('/ardrone/takeoff', Empty, queue_size=1)
			
			while takeoff.get_num_connections() < 1:
				rospy.sleep(0.1)
			
			takeoff.publish(empty)
			rospy.sleep(5)
		«ENDFOR»
		
		«FOR f : main.fly.commands»
			«IF f instanceof Command»
				«f.compile»
			«ENDIF»
		«ENDFOR»
		
		«FOR to : main.fly.land»  
			land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)
						
			while land.get_num_connections() < 1:
				rospy.sleep(0.1)
			
			land.publish(empty)
		«ENDFOR»
	'''
	
	def compile(Command cmd) '''
«««		«IF cmd instanceof Up »
«««		move(0.1, «cmd.distance», True, "z")
«««	  	«ENDIF»
«««	  	«IF cmd instanceof Down»
«««	  	move(0.1, «cmd.distance», False, "z")
«««	  	«ENDIF»
«««	  	«IF cmd instanceof Left »
«««	  	move(0.1, «cmd.distance», True, "y")
«««	  	«ENDIF»
«««	  	«IF cmd instanceof Right»
«««	  	move(0.1, «cmd.distance», False, "y")
«««	  	«ENDIF»
«««	  	«IF cmd instanceof Forward»	
«««	  	move(0.1, «cmd.distance», True, "x")
«««	  	«ENDIF»
«««	  	«IF cmd instanceof Backward»	
«««	  	move(0.1, «cmd.distance», False, "x")
«««	  	«ENDIF»
«««	  	«IF cmd instanceof RotateL»	
«««		rotate(30, «cmd.angle», False)
«««	  	«ENDIF»
«««	  	«IF cmd instanceof RotateR»	
«««	  	rotate(30, «cmd.angle», True)
«««	  	«ENDIF»
	  	«IF cmd instanceof Wait»
	  	rospy.sleep(«cmd.seconds»)
	  	«ENDIF»
	  	«IF cmd instanceof Move»
	  	
«««	  	Remember to change position and rotation of the drone
	  	«ENDIF»
	'''

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var result = "";
		var time = System.currentTimeMillis();
		for(main : resource.allContents.toIterable.filter(Main)) {
			result = main.compilePython.toString; 
			fsa.generateFile('/xdrone/result.py', result); //Locally change path to 'result.py'
		}
		
		try {
			var file = new File("/xdrone/result.py");
			file.getParentFile().mkdirs();
			
			var writer = new PrintWriter(file, "UTF-8");
		    writer.println(result);
		    writer.close();   
		} catch (IOException e) {
		   // do something
		}
//		fsa.generateFile('result.py', result)

		
		result = "";
		for(fly : resource.allContents.toIterable.filter(Fly)) {
			result = fly.compileJS.toString; 
			fsa.generateFile('Webroot/simulator' + time +'.js', result); //locally change path to 'Webroot/simulator' + time +'.js'
		}
		
		try {
			var file = new File('Webroot/simulator' + time +'.js');
			file.getParentFile().mkdirs();
			
			var writer = new PrintWriter(file, "UTF-8");
		    writer.println(result);
		    writer.close();   
		} catch (IOException e) {
		   // do something
		}
//		fsa.generateFile('result.py', result)
		
		
		result = "";
		for(environment : resource.allContents.toIterable.filter(Environment)) {
			result = environment.compile.toString; 
			fsa.generateFile('Webroot/environment' + time +'.js', result); //locally change path to 'Webroot/simulator' + time +'.js'
		}
		
		try {
			var file = new File('Webroot/environment' + time +'.js'); //locally change path to 'Webroot/simulator' + time +'.js'
			file.getParentFile().mkdirs();
			
			var writer = new PrintWriter(file, "UTF-8");
		    writer.println(result);
		    writer.close();   
		} catch (IOException e) {
		   // do something
		}
		
//		fsa.generateFile('Webroot/simulator' + time +'.js', simulator)
	}
}