
public class Mirage extends vehicle {
//the mirage is a French plane
	private int pitch = 0;
	public Mirage() {
		super(2340, 2, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pressOnGas() {
		// TODO Auto-generated method stub
		speedUp(26.0);
	}

	@Override
	public void pressHardOnGas() {
		// TODO Auto-generated method stub
		speedUp(75.0);
	}

	@Override
	public void pressOnBrake() {
		// TODO Auto-generated method stub
		slowDown(30.0);
	}

	@Override
	public void pressHardOnBrake() {
		// TODO Auto-generated method stub
		slowDown(40.0);
	}
	public void pitchDown(int degrees) {
		pitch -= degrees;
		while(Math.abs(degrees)>90) {
			if(pitch < -90) pitch = 180+pitch;
			if(pitch > 90) pitch = 180-pitch;
		}
		
	}
	public void pitchUp(int degrees) {
		pitch += degrees;
		while(Math.abs(degrees)>90) {
			if(pitch < -90) pitch = 180+pitch;
			if(pitch > 90) pitch = 180-pitch;
		}
		
	}
}
