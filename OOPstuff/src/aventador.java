
public class aventador extends vehicle{
//aventador is a Italian sports car
	public aventador() {
		super(350, 2, 2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void pressOnGas() {
		// TODO Auto-generated method stub
		speedUp(5.0);
	}
	@Override
	public void pressHardOnGas() {
		// TODO Auto-generated method stub
		speedUp(20.0);
	}
	@Override
	public void pressOnBrake() {
		// TODO Auto-generated method stub
		slowDown(5.0);
	}
	@Override
	public void pressHardOnBrake() {
		// TODO Auto-generated method stub
		slowDown(25.0);
	}

}
