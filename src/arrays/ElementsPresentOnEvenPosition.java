package arrays;

public class ElementsPresentOnEvenPosition {
	/*
	 * Initialize Array:

	int[] arr = new int[] {1, 2, 3, 4, 5};: 
	Initializes an array with values 1, 2, 3, 4, and 5.
	Print Message: System.out.println("Elements of given array present at even positions:");: 
	Prints a message indicating that the elements at even positions will be displayed.
	Loop Through Array:

	for (int i = 1; i < arr.length; i = i + 2) {: 
	Starts a loop from index 1 and increments the index by 2 each time to access even-positioned elements.
	The loop runs as long as the index (i) is less than the length of the array.
	Print Even-Positioned Elements:

	System.out.println(arr[i]);: 
	Prints the element at the current even position.
	 */

	public static void main(String[] args) {

		//Initialize array
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("elements of given array present on the even position");
		
		//Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
		
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}

}
