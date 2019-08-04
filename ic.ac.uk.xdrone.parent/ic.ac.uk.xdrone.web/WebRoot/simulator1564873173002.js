var commands = [];
var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
var goalDroneLocation = currentDroneLocation;

//Drone's path
var lineMaterial = new THREE.LineBasicMaterial({color: 0x1ACF10});
var lineGeometry = new THREE.Geometry();
lineGeometry.vertices.push(
	new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z)
);
var lastX = drone.position.x, lastY = drone.position.y, lastZ = drone.position.z;
commands.push({x: 0, y: 0.7, z: 0}); 
lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY + 0.7, lastZ));
lastY += 0.7;
commands.push({x: 0, y: -0.7, z: 0}); 
lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY - 0.7, lastZ));
lastY -= 0.7;
nextLocation();

var line = new THREE.Line( lineGeometry, lineMaterial );
scene.add( line );
function flySimulation(){
	if(fly(goalDroneLocation)){
		nextLocation();
	}
}

function nextLocation(){
	if(commands && commands[0]){
		goalDroneLocation.x += commands[0].x;
		goalDroneLocation.y += commands[0].y;
		goalDroneLocation.z += commands[0].z;
		commands.shift();
	}
}
