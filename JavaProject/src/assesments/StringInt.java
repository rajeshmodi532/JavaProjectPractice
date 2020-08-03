package assesments;


public class StringInt {

	public String method()
	{
		String result="";
		String str = "Interview";
		int n = 5;

		String val=str.substring(0, n);
		for(int i=0;i<n;i++)
		{
			result += val;
		}
		return result;
	}

	public static void main(String[] args)
	{
		StringInt SInt = new StringInt();
		System.out.print(SInt.method());
	}
}

//Output
//if n=2
//InIn
//if n=3
//IntIntInt