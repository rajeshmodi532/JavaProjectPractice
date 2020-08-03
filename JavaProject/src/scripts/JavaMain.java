package scripts;

public class JavaMain {

	/*
	 * static int myMethod(int x) {
	 * 
	 * return 5 + x; }
	 * 
	 * public static void main(String[] args) { System.out.println(myMethod(3)); }
	 */

	// Create a checkAge() method with an integer variable called age
	static void checkAge(int age)
	{
		// If age is less than 18, print "Access denied"
		
		if(age<18) 
		{
			System.out.println("Access denied"); 

			// If age is greater than 18, print "Access granted"
		} 
		else
		{
			System.out.println("Access granted"); 
		}

	} 

	public static void main(String[] args) { 
		// Call the checkAge method and pass along an age of 20

		checkAge(20);
	}

}
