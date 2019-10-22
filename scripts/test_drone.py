from pyparrot.Minidrone import Mambo

mamboAddr = "e0:14:55:b4:3d:a9"

drone = Mambo(mamboAddr)

print("Attempting connection...")
success = drone.connect(num_retries=3)

if (success):
    print("Connection successful")
    drone.safe_takeoff(3)
    drone.smart_sleep(1)
    drone.safe_land(3)
    drone.disconnect()
else:
    print("Connection failed")
