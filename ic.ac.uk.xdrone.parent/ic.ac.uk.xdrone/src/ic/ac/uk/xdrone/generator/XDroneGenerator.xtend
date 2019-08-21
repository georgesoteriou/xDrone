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
import ic.ac.uk.xdrone.xDrone.Down
import java.io.PrintWriter
import java.io.IOException
import java.io.File
import ic.ac.uk.xdrone.xDrone.Environment
import ic.ac.uk.xdrone.xDrone.Drone
import ic.ac.uk.xdrone.xDrone.Rotate
import ic.ac.uk.xdrone.xDrone.Main
import ic.ac.uk.xdrone.xDrone.GoTo
import ic.ac.uk.xdrone.xDrone.Forward
import ic.ac.uk.xdrone.xDrone.Backward

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
		«FOR to : fly.takeoff»
			commands.push("TAKEOFF");
		«ENDFOR»
		
		«FOR f : fly.commands»
			«IF f instanceof Command»
				«f.compileJS»
			«ENDIF»
		«ENDFOR»	
		
		«FOR to : fly.land»
			commands.push("LAND");
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
					//changeDroneCollisionBox(0.25,0,0.25)
					destination = 0.7;
					currentFunction = "MOVE_Y";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				else if(commands[0] == "LAND"){
					//changeDroneCollisionBox(0.25,0,0.25)
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
«««	  	«IF cmd instanceof Move»
«««	  		if(«cmd.vector.y» != 0)
«««				commands.push({y: «cmd.vector.y»}); 
«««			if(«cmd.vector.z» != 0)	
«««				commands.push({z: «cmd.vector.z»});
«««			if(«cmd.vector.x» != 0)	 
«««				commands.push({x: «cmd.vector.x»}); 
«««	  	«ENDIF»
«IF cmd instanceof Up »
		commands.push({y: «cmd.distance»}); 
	  	«ENDIF»
	  	«IF cmd instanceof Down»
commands.push({y: -«cmd.distance»}); 
	  	«ENDIF»
	  	«IF cmd instanceof Left »
commands.push({x: «cmd.distance»});
	  	«ENDIF»
	  	«IF cmd instanceof Right»
commands.push({x: -«cmd.distance»});
	  	«ENDIF»
	  	«IF cmd instanceof Forward»	
commands.push({z: «cmd.distance»});
	  	«ENDIF»
	  	«IF cmd instanceof Backward»
commands.push({z: -«cmd.distance»});
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
		#Constants
		ACCEPTED_DISTANCE_ERROR = 20
		ACCEPTED_ALTITUDE_ERROR = 50
		DISTANCE_ONE_AND_HALF_SECOND = 0.85
		DISTANCE_TWO_SECONDS = 1.20
		DISTANCE_TWO_AND_HALF_SECONDS = 1.65
		
		state = -1
		dronePosition = {
			'x': 0,
			'y': 0,
			'z': 0
		}
		currentAngle = 0.0 #Navdata
		currentDroneAngle = 270.0 #Real Life
		
		«IF main.environment !== null»
			«FOR d : main.environment.drone»
				dronePosition.x = «d.position.vector.z»
				dronePosition.z = «d.position.vector.y»
				dronePosition.y = «d.position.vector.x»
				«IF d.rotation !== null»
					currentDroneAngle += «d.rotation»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		
		objects = {}
		
		«IF main.environment !== null»
			«FOR ob : main.environment.objects»
				objects['«ob.object_name»'] = {
					'x': «ob.origin.vector.z»,
					'y': «ob.origin.vector.x»,
					'z': «ob.origin.vector.y» + «ob.size.vector.y»/2
				}
			«ENDFOR»
		«ENDIF»
		
		#RotY:		RotX:
		#+ forward 	+ right
		#- backwards	- left
		def ReceiveNavdata(data):
			global state
			global currentAngle
			global currentAltitude
			
			currentAngle = data.rotZ
			state = data.state
			currentAltitude = data.altd
		
		
		def getTimeFromDistance(distance):
			global DISTANCE_ONE_AND_HALF_SECOND
			global DISTANCE_TWO_SECONDS
			global DISTANCE_TWO_AND_HALF_SECONDS
			if distance <= DISTANCE_ONE_AND_HALF_SECOND:
				return 1.5 * distance /DISTANCE_ONE_AND_HALF_SECOND
			elif distance <= DISTANCE_TWO_SECONDS:
				return 1.5 + ((distance- DISTANCE_ONE_AND_HALF_SECOND) * 0.5 / (DISTANCE_TWO_SECONDS-DISTANCE_ONE_AND_HALF_SECOND))
			else:
				return 2 + ((distance- DISTANCE_TWO_SECONDS) * 0.5 / (DISTANCE_TWO_AND_HALF_SECONDS-DISTANCE_TWO_SECONDS))
				
		def getDistanceToObject(objectName):
			global objects
			obPosition = {}
			if objects[objectName]:
				obPosition = objects[objectName]
			
			if 'x' in obPosition and 'z' in obPosition:
				x = abs(dronePosition['x'] - obPosition['x'])
				y = abs(dronePosition['y'] - obPosition['y'])
				
				return {
					'x': math.sqrt( x*x + y*y ),
					'z': getDistance(dronePosition['z'], obPosition['z'])
				}
			else:
				return {'x': 0, 'z': 0}
				
				
		def getDistance(dronePos, obPos):
		  if dronePos > obPos:
		    return - abs(dronePos - obPos);
		  else:
		    return abs(dronePos - obPos);
		
		
		def getRotationToObject(objectName):
			global objects
			obPosition = {}
			if objects[objectName]:
				obPosition = objects[objectName]
				
			if 'x' in obPosition and 'z' in obPosition:
				angleToObject = math.atan2(dronePosition['x'] - obPosition['x'], dronePosition['y'] - obPosition['y']) * 180 / math.pi
				
				angleToObject = angleTo360(angleToObject)
				isPositive = True;
				if currentDroneAngle > angleToObject:
					isPositive = False
					
				angleToObject = abs(currentDroneAngle - angleToObject)
				
				if angleToObject > 180:
					angleToObject = 360 - angleToObject;
					isPositive = not isPositive;
				
				return angleToObject if isPositive else -angleToObject
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
		
			
		def oppositeSigns(x, y): 
			return (x < 0) if (y >= 0) else (y < 0)
		
		def rotate(speed, angle):
			global currentAngle
			lastAngle = currentAngle
			angleDone = 0.0
			accuracy_modificator = 5
			
			vel_msg = Twist()
		
			angular_speed = speed*PI/360
		
			clockwise = False
			if angle < 0:
				clockwise = True
		
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			vel_msg.linear.z=0
			vel_msg.angular.x = 0
			vel_msg.angular.y = 0
		
			if clockwise:
				vel_msg.angular.z = -angular_speed
			else:
				vel_msg.angular.z = angular_speed*2 #For some reason rotates slower to left
		
			while velocity_publisher.get_num_connections() < 1:
				rospy.sleep(0.1)
		
			while(angleDone < abs(angle)-accuracy_modificator):
				if oppositeSigns(lastAngle, currentAngle) and abs(currentAngle > 90):
					angleDone += abs(abs(currentAngle)-180 + (abs(lastAngle)-180))
					
				else:
					angleDone += abs(currentAngle - lastAngle)
		
				lastAngle = currentAngle	
				velocity_publisher.publish(vel_msg)
		
		
			vel_msg.angular.z = 0
			velocity_publisher.publish(vel_msg)
		
		
		def moveBaseOnTime(distance, x ,y):
			global velocity_publisher
		
			while velocity_publisher.get_num_connections() < 1:
				rospy.sleep(0.1)
		
			vel_msg = Twist()
			vel_msg.linear.x= x if distance > 0 else -x
			vel_msg.linear.y= y if distance > 0 else -y  #y+ is left
			vel_msg.linear.z=0
			vel_msg.angular.x = 0
			vel_msg.angular.y = 0
			vel_msg.angular.z = 0
			
			tStart = rospy.Time.now().to_sec()
			tEnd = tStart;
		  	timeRequired = getTimeFromDistance(abs(distance))
		  
			while(tEnd-tStart) < timeRequired:
				velocity_publisher.publish(vel_msg)
				tEnd = rospy.Time.now().to_sec()	
		
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			velocity_publisher.publish(vel_msg)
				
		def moveUpAndDown(distance):
			global zLocation
			global velocity_publisher
		
			vel_msg = Twist()
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			vel_msg.angular.x = 0
			vel_msg.angular.y = 0
			vel_msg.angular.z = 0
			goalDistance = currentAltitude + (distance*1000)
			
			while abs(abs(currentAltitude) - abs(goalDistance)) > ACCEPTED_ALTITUDE_ERROR:
				if(goalDistance > currentAltitude):
					vel_msg.linear.z=0.15
				else:
					vel_msg.linear.z=-0.15
				print(currentAltitude, goalDistance)
				velocity_publisher.publish(vel_msg)
		
			vel_msg.linear.z=0
			velocity_publisher.publish(vel_msg)
			
		def noMove(timeRequired):
			global velocity_publisher
		
			while velocity_publisher.get_num_connections() < 1:
				rospy.sleep(0.1)
		
			vel_msg = Twist()
			vel_msg.linear.x=0
			vel_msg.linear.y=0
			vel_msg.linear.z=0
			vel_msg.angular.x = 0
			vel_msg.angular.y = 0
			vel_msg.angular.z = 0
			
			tStart = rospy.Time.now().to_sec()
			tEnd = tStart;
		
			while(tEnd-tStart) < timeRequired:
				velocity_publisher.publish(vel_msg)
				tEnd = rospy.Time.now().to_sec()
				
		#Main
		rospy.init_node('test_node')
		empty = Empty()
		rospy.Subscriber('/ardrone/navdata', Navdata, ReceiveNavdata)
		velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
		
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
			
			dronePosition['z'] += 0.7
			takeoff.publish(empty)
			noMove(5)
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
			rospy.sleep(3)
		«ENDFOR»
	'''
	
	def compile(Command cmd) '''
		«IF cmd instanceof Up »
		dronePosition['z'] += «cmd.distance»
		moveUpAndDown(«cmd.distance»)
	  	«ENDIF»
	  	«IF cmd instanceof Down»
dronePosition['z'] += -«cmd.distance»
moveUpAndDown(-«cmd.distance»)
	  	«ENDIF»
	  	«IF cmd instanceof Left »
dronePosition['y']  += «cmd.distance»
moveBaseOnTime(«cmd.distance», 0, 0.15)
noMove(1)
	  	«ENDIF»
	  	«IF cmd instanceof Right»
dronePosition['y']  += -«cmd.distance»
moveBaseOnTime(-«cmd.distance», 0, 0.15)
noMove(1)
	  	«ENDIF»
	  	«IF cmd instanceof Forward»	
dronePosition['x'] += «cmd.distance»
moveBaseOnTime(«cmd.distance», 0.15, 0)
noMove(1)
	  	«ENDIF»
	  	«IF cmd instanceof Backward»	
dronePosition['x'] += -«cmd.distance»
moveBaseOnTime(-«cmd.distance», 0.15, 0)
noMove(1)
	  	«ENDIF»
«««	  	«IF cmd instanceof RotateL»	
«««		rotate(30, «cmd.angle», False)
«««	  	«ENDIF»
«««	  	«IF cmd instanceof RotateR»	
«««	  	rotate(30, «cmd.angle», True)
«««	  	«ENDIF»
	  	«IF cmd instanceof Wait»
	  		moveBaseOnTime(«cmd.seconds», 0, 0)
	  	«ENDIF»
	  	«IF cmd instanceof Rotate»
currentDroneAngle += -«cmd.angle»
rotate(30, -«cmd.angle»);
	  	«ENDIF»
«««	  	«IF cmd instanceof Move»
«««	  		if «cmd.vector.y» != 0:
«««	  			dronePosition['z'] += «cmd.vector.y»
«««	  			moveUpAndDown(«cmd.vector.y»)
«««	  		if «cmd.vector.z» != 0:	
«««	  			dronePosition['x'] += «cmd.vector.z»
«««	  			moveBaseOnTime(«cmd.vector.z», 0.15, 0)
«««	  			noMove(1)
«««	  		if «cmd.vector.x» != 0:
«««	  			dronePosition['y']  += «cmd.vector.x»
«««	  			moveBaseOnTime(«cmd.vector.x», 0, 0.15)
«««	  			noMove(1)
«««	  	«ENDIF»
	  	«IF cmd instanceof GoTo»
		  	vector = getDistanceToObject("«cmd.object_name»");
		  	angle = getRotationToObject("«cmd.object_name»");
		  	currentDroneAngle += angle
		  	rotate(30, angle);
		  	dronePosition['z'] += vector['z']
		  	moveUpAndDown(vector['z'])
		  	dronePosition['x'] += vector['x']
		  	moveBaseOnTime(vector['x'], 0.15, 0)
		  	noMove(1)
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