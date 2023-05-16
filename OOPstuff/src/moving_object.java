public interface moving_object {
	//interface class specifies how other programs can control the class
	//everything specified in an interface must be available
	//in a class that implements the interface
	//the inner workings of which is up to the class itself
	//in a way interfaces are just abstract classes with less control
	//classes that implements interfaces can implement more than one
	void turnLeft(int degrees);
	void turnRight(int degrees);
	void speedUp(double addedSpeed);
	void slowDown(double subtractedSpeed);
	//all of these methods are things that any vehicle should be able to do and what other classes should be able to interact with
	//we can't specify the behaviors of it in an interface as all methods are automatically abstract and public
}
