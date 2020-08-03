package scripts;

interface FirstInterface {
	public void myMethod(); // interface method
	/*Abstract / Interface methods can't specify body*/
	/* public void RegularMethod() { System.out.println("Regular"); } */
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

public class MultipleInterface implements FirstInterface, SecondInterface
{
	public void myMethod()
	{
		System.out.println("Some text..");
	}
	public void myOtherMethod()
	{
		System.out.println("Some other text...");
	}


	public static void main(String[] args)
	{
		MultipleInterface myObj = new MultipleInterface();
		myObj.myMethod();
		myObj.myOtherMethod();
	}

}