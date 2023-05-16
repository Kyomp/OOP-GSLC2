public interface moving_object {
	//interface class specifies how other programs can control the class
	//everything specified in an interface must be available 
	//in a class that implements the interface
	//the inner workings of which is up to the class itself
	//in a way interfaces are just abstract classes with less specifications
	//classes that implements interfaces can implement more than one unlike abstract class
	void turningLeft();
	void turningRight();
	void speedingUp(double addedSpeed);
	void slowingDown(double reducedSpeed);
	//all of these methods are things that any moving object should be able to do and what other classes should be able to interact with
	//we can't specify the behaviors of it in an interface as all methods are automatically abstract and public
}
