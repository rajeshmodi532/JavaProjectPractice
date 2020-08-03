package practice.java;


public class ConstructorNoArgument
{
	//No Argument constructor
	int i;
	public ConstructorNoArgument()
	{
		i=10;
	}

	public static void main(String[] args) {
		ConstructorNoArgument con = new ConstructorNoArgument();
		System.out.println(con.i);
	}
}