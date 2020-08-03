package scripts;

public class String_to_Int_ViceVersa {

	public static void main(String[] args)
	{

		String_to_Int_ViceVersa a = new String_to_Int_ViceVersa();
		a.String_Int();


	}
	public void String_Int()
	{
		String S = "51";
		int I = Integer.parseInt(S);
		System.out.println(S);
		System.out.println(I);
		I = I+1;
		S=String.valueOf(I);
		System.out.println(S);
	}

}