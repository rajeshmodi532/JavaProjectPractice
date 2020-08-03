package practice.java;

public class AccessModifiers {

	private static String Str;

	public static void Method()
	{
		Str = "Hello";
		System.out.println(Str);
	}
	
	protected static void ProMthd()
	{
		System.out.println("This is Protected method");
	}

	public static void main(String[] args) {
		Method();
		ProMthd();
	}
	

}