package scripts;

public class MultipleInterfaceClass implements FirstInterface, SecondInterface
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
		MultipleInterfaceClass myObj = new MultipleInterfaceClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}

}