public abstract class vehicle implements moving_object{
	//abstract classes are like normal classes with the added bonus of being able to use abstract methods in the class
	//it is similar to interface in that it outlines what the inherited class should look like
	//it differs however in that it also specifies the inner workings and behaviors of the inherited class
	protected final int maxSpeed;
	protected final int noOfSeats;
	protected final int noOfDoors;
	private double speed;
	private int direction;
	//it is able to declare variables like a normal class
	protected vehicle(int maxSpeed, int noOfSeats, int noOfDoors) {
		this.maxSpeed = maxSpeed;
		this.noOfDoors = noOfDoors;
		this.noOfSeats = noOfSeats;
		speed = 0;
		direction = 0;
	}
	//it has a constructor just like a normal class
	public void turnLeft(int degrees) {
		direction -= degrees;
		while(direction < 0) {
			direction = 360 + direction;
		}
	}
	//can use non-abstract methods like a normal class
	public void turnRight(int degrees) {
		direction += degrees;
		while (direction>359) {
			direction -= 360;
		}
	}
	public void speedUp(double addedSpeed) {
		speed += addedSpeed;
		if (speed > maxSpeed)speed = maxSpeed;
	}
	public void slowDown(double d) {
		speed -= d;
		if(speed < 0)speed = 0;
	}

	protected double getSpeed() {
		return speed;
	}
	protected int getDirection() {
		return direction;
	}
	
	public abstract void pressOnGas();
	public abstract void pressHardOnGas();
	public abstract void pressOnBrake();
	public abstract void pressHardOnBrake();
	//for methods that can't be generalized can have the abstract method to allow for the inherited class to specify instead
}
