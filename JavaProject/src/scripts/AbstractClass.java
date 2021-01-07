package scripts;

//Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalSound();
	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
	/*Can't create object for abstract class*/
	//Animal obj = new Animal();
	/**Added comment to commit dummy**/
}

//Subclass (inherit from Animal)
public class AbstractClass extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	public static void main(String[] args) {
		AbstractClass myPig = new AbstractClass(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}