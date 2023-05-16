public abstract class vehicle {
	//abstract classes are like normal classes with the added bonus of being able to use abstract methods in the class
	//it is similar to interface in that it outlines what the inherited class should look like
	//it differs however in that it also specifies the inner workings and behaviors of the inherited class
	protected final int maxSpeed;
	private double speed;
	private String direction;
	//it is able to declare variables like a normal class
	//unlike in interfaces, variables can have any kinds of 
	protected vehicle(int maxSpeed, double currentSpeed) {
		this.maxSpeed = maxSpeed;
		speed = currentSpeed;
		direction = "North";
	}
	//it has a constructor just like a normal class
	protected void turnLeft() {
		switch(direction) {
			case "North":
				direction = "West";
			case "West":
				direction = "South";
			case "South":
				direction = "East";
			case "East":
				direction = "North";
		}
	}
	//can use non-abstract methods like a normal class
	protected void turnRight() {
		switch(direction) {
		case "North":
			direction = "East";
		case "West":
			direction = "North";
		case "South":
			direction = "West";
		case "East":
			direction = "South";
		}
	}
	protected void speedUp(double addedSpeed) {
		speed += addedSpeed;
		if (speed > maxSpeed)speed = maxSpeed;
	}
	protected void slowDown(double subtractedSpeed) {
		speed -= subtractedSpeed;
		if(speed < 0)speed = 0;
	}

	protected double getSpeed() {
		return speed;
	}
	protected String getDirection() {
		return direction;
	}
	
	public abstract void displayInfo();
	//for methods that can't be generalized can have the abstract method to allow for the inherited class to specify instead
}
