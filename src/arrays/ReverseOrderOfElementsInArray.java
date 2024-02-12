package arrays;

public class ReverseOrderOfElementsInArray {

	public static void main(String[] args) {

		//initialize array
		int[] arr = {1,2,3,4,5};
		
		System.out.println("original array ");
		
		//loop to print all elements in an array
		for(int i=0; i<arr.length; i++)
		{
			//print original array
			System.out.print(arr[i]);
		}
		System.out.println();
		
		//array in reverse order
		System.out.println("array in reverse order ");
		
		//loop to reverse the array elements
		for(int i=arr.length-1;i>=0;i--)
		{
			//print reversed array
			System.out.print(arr[i]);
		}
	}

}
