
public class Mirage extends vehicle implements moving_object {
	//french jet
	public Mirage() {
		super(2220, 500);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		if(isFlying()) {
		System.out.printf("The mirage is moving %s at %lf over towns\n",getDirection(),getSpeed());
		}
		else {
			System.out.printf("The mirage is driving %s at %lf on the runway\n",getDirection(),getSpeed());
		}
	}

	@Override
	public void turningLeft() {
		// TODO Auto-generated method stub
		turnLeft();
		if(isFlying())System.out.println("The mirage rolls to the left and turns");
		else System.out.println("The mirage turns to the left");
	}

	@Override
	public void turningRight() {
		// TODO Auto-generated method stub
		turnRight();
		if(isFlying())System.out.println("The mirage rolls to the right and turns");
		else System.out.println("The mirage turns to the right");
	}

	@Override
	public void speedingUp(double addedSpeed) {
		// TODO Auto-generated method stub
		speedUp(addedSpeed);
		System.out.println("The pilot turns on afterburners");
		if(getSpeed()==maxSpeed) {
			System.out.println("The wings are able to break off");
		}
	}

	@Override
	public void slowingDown(double reducedSpeed) {
		// TODO Auto-generated method stub
		System.out.println("The pilot deploys the airbrakes");
		if(isFlying() && getSpeed()-reducedSpeed<300) {
			System.out.println("The mirage is about to stall");
		}
		slowDown(reducedSpeed);
	}
	
	private boolean isFlying() {
		if(getSpeed()<300)return false;
		else return true;
	}


}
