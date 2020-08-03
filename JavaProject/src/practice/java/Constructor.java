package practice.java;


public class Constructor {

	String str;
	//Parameterized Constructor
	public Constructor(String S)
	{
		str = S; 
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Constructor con1 = new Constructor("This is Parameterized constructor");
		Constructor con2 = new Constructor("Second object for parametrized constrcutor");

		System.out.println(con1.str+"\n"+con2.str);
	}
}