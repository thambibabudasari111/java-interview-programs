package arrays;

public class FindElementsOnEvenPosition {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,9};
		
		System.out.println("elements on the even position");
		//Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
		
	}

}
