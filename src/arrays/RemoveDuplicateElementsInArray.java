package arrays;

public class RemoveDuplicateElementsInArray {

	/*
	 * Explanation:
	 * 
	 * removeDuplicateElements Method:
	 * 
	 * The method takes an array (arr) and its length (n) as parameters. If the
	 * array has 0 or 1 elements, there are no duplicates to remove, and the method
	 * returns the original length. It creates a temporary array (temp) to store
	 * unique elements. It uses a loop to iterate through the original array and
	 * adds unique elements to the temporary array. Finally, it updates the original
	 * array with unique elements and returns the new length. main Method:
	 * 
	 * Initializes an array (arr) with duplicate elements. Calls the
	 * removeDuplicateElements method to modify the array and get the new length.
	 * Prints the modified array without duplicate elements.
	 */

	
	// Method to remove duplicate elements from the array
	public static int removeDuplicateElements(int arr[], int n) {
		// If the array has 0 or 1 elements, there are no duplicates to remove
		if (n == 0 || n == 1) {
			return n;
		}

		// Create a temporary array to store unique elements
		int[] temp = new int[n];

		// Index to track the position in the temporary array
		int j = 0;

		// Iterate through the original array to find unique elements
		for (int i = 0; i < n - 1; i++) 
		{
			// If the current element is different from the next element, add it to the temporary array
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];
		}
		
		// Add the last element of the original array to the temporary array
		temp[j++] = arr[n - 1];

		// Update the original array with unique elements
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];

		}
		// Return the length of the modified array
		return j;
	}

	public static void main(String[] args) {

		// Input array with duplicate element
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };

		// Length of the input array
		int length = arr.length;

		// Call the removeDuplicateElements method to modify the array and get the new length
		length = removeDuplicateElements(arr, length);

		 // Printing the array elements without duplicates		
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
