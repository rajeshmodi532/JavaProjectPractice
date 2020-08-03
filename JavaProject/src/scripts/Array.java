package scripts;

public class Array {

	public static void main(String[] args) {

		int[] arr = new int[4];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=i;
		}
		
		for (int a:arr)
		{
			System.out.println(a);
		}
	}
}
