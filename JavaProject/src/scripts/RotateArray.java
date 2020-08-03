package scripts;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = {1,2,3,4,5};
		int n=2;

		//Display original array
		for (int i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+" ");

		}
		System.out.println();
		//Rotate Array by n times towards right 
		for (int i=0;i<n;i++)
		{
			int last = Arr[Arr.length-1];
			
			for (int j=Arr.length-1;j>0;j--)
			{
				Arr[j]=Arr[j-1];
			//System.out.print(Arr[j]+" ");
			}
			Arr[0]=last;
		}
		System.out.println();
		
		for(int i = 0; i< Arr.length; i++){    
            System.out.print(Arr[i] + " ");    
        }    
		

	}

}
