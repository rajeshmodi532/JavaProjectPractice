package scripts;

import java.util.Scanner;

public class RotateArray_Custom {

	public static void RotateArray(int arrlength,int N,int M[])
	{
		//Display original array
		for (int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+" ");
		}
		System.out.println();
		//Rotate Array by n times towards right 
		int first=0;
		for (int i=0;i<N;i++)
		{
			for (int j=0;j<M.length-1;j++)
			{
				if(j==0)
				{
					first=M[j];
				}
				M[j]=M[j+1];
			}
			M[M.length-1]=first;
		}
		System.out.println();
		for(int i = 0; i< M.length; i++){    
			System.out.print(M[i] + " ");
		}
	}

	public static void main(String[] args) {
		int N=0;//Rotation
		int M=0;//Arraylength
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array length: ");
		M = input.nextInt();
		input = new Scanner(System.in);
		System.out.print("Enter the number of rotations: ");
		N = input.nextInt();
		int A[]=new int[M];
		System.out.print("Enter the array number: ");
		for(int i=0;i<A.length;i++)
		{
			input=new Scanner(System.in);
			A[i]=input.nextInt();
		}
		RotateArray(M,N,A);
	}
}
