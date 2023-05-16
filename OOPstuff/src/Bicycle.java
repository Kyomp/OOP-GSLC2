
public class Bicycle extends vehicle implements moving_object {

	public Bicycle() {
		super(50, 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turningLeft() {
		// TODO Auto-generated method stub
		turnLeft();
		System.out.println("The cycler turns left at the turn");
	}

	@Override
	public void turningRight() {
		// TODO Auto-generated method stub
		turnRight();
		System.out.println("The cycler turns Right at the turn");
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.printf("The cycler is moving %s at %lf through the streets\n",getDirection(),getSpeed());
	}

	@Override
	public void speedingUp(double addedSpeed) {
		// TODO Auto-generated method stub
		speedUp(addedSpeed);
		System.out.println("The cycler is cycling faster");
		if(getSpeed()==maxSpeed) {
			System.out.println("The cycler is getting tired");
		}
	}

	@Override
	public void slowingDown(double reducedSpeed) {
		// TODO Auto-generated method stub
		slowDown(reducedSpeed);
		System.out.println("The cycler pulls the brakes");
		if(getSpeed()==0.0) {
			System.out.println("The cycler has come to a stop");
		}
	}

}
