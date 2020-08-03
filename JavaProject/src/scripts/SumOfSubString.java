package scripts;

import java.io.IOException;
import java.util.Scanner;

public class SumOfSubString {
	public static void method(int[] arr)
	{
		int result = 0;
		String xx = "";
		for(int k=0;k<=arr.length;k++)
		{
			for (int i = 0; i < arr.length; i++)
			{
				for (int j = k; j < i + 1; j++)
				{
					xx += "" + arr[j];
				}
				if(xx!="")
				{
					if (xx.substring(xx.length()-1) != " ")                    	
					{
						result += Integer.parseInt(xx);
						xx = "";
					}
				}
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) throws IOException
	{
		//int arr[]= {1,2,3,4};
		//int arr[]= {1,1,1};
		int arrlenth=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array length: ");
		arrlenth = input.nextInt();
		int M[]=new int[arrlenth];
		System.out.print("Enter the array number: ");
		for(int i=0;i<M.length;i++)
		{
			input=new Scanner(System.in);
			M[i]=input.nextInt();
		}
		method(M);
	}
}