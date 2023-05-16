
public class ship extends vehicle implements moving_object {

	public ship() {
		super(80, 20);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turningLeft() {
		// TODO Auto-generated method stub
		turningLeft();
		System.out.println("The ship slowly turns to the left");
	}

	@Override
	public void turningRight() {
		// TODO Auto-generated method stub
		turningRight();
		System.out.println("The ship slowly turns to the right");
	}

	@Override
	public void speedingUp(double addedSpeed) {
		// TODO Auto-generated method stub
		speedUp(addedSpeed);
		System.out.println("The captain pushes the throttle");
	}

	@Override
	public void slowingDown(double reducedSpeed) {
		// TODO Auto-generated method stub
		slowDown(reducedSpeed);
		System.out.println("The captain reverses the throttle");
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.printf("The cycler is sailing %s at %lf through the waves\n",getDirection(),getSpeed());
	}

}
