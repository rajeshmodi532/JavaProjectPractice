package scripts;

public class ConsegitiveOnes {

	static int getMaxLength(Boolean[] arr, int n) 
	{ 
		int count = 0; //intitialize count 
		int result = 0; //initialize max 

		for (int i = 0; i < n; i++) 
		{ 
			// Reset count when 0 is found 
			if (arr[i]=false) 
				count = 0; 

			// If 1 is found, increment count 
			// and update result if count becomes 
			// more. 
			else
			{ 
				count++;//increase count 
				result = Math.max(result, count); 
			} 
		} 
		return result; 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ 
			Boolean arr[] = {true,true,true,false,false,true,true,true,true,false,false,true,true};
			//int arr[] = {1,1,1,0,0,1,1,1,1,0,0,1,1};
	        int n = arr.length; 
	        System.out.println(getMaxLength(arr, n)); 
	    } 
	}
}
