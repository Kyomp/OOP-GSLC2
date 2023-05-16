
public class concordia extends vehicle {
//italian cruise liner
	public concordia() {
		super(36, 5000, 2000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pressOnGas() {
		// TODO Auto-generated method stub
		speedUp(0.5);
	}

	@Override
	public void pressHardOnGas() {
		// TODO Auto-generated method stub
		speedUp(0.7);
	}

	@Override
	public void pressOnBrake() {
		// TODO Auto-generated method stub
		slowDown(0.3);
	}

	@Override
	public void pressHardOnBrake() {
		// TODO Auto-generated method stub
		slowDown(0.5);
	}

}
