package strings;

public class CountTotalNoOfCharsInString {

	/*
	 * String Initialization:
	 * 
	 * String str = "this is a java";: Initializes a string variable str with the
	 * value "this is a java". Variable Initialization:
	 * 
	 * int totalCount = 0;: Initializes an integer variable totalCount to count the
	 * total number of characters. Loop through Characters:
	 * 
	 * for (int i = 0; i < str.length(); i++) {: Starts a loop that iterates through
	 * each character in the string. Character Check:
	 * 
	 * if (str.charAt(i) != ' '): Checks if the current character is not a space ('
	 * '). Increment Total Count:
	 * 
	 * totalCount++;: If the current character is not a space, increments the total
	 * count. Print Result:
	 * 
	 * System.out.println("Total number of characters: " + totalCount);: Prints the
	 * total number of characters in the string after the loop.
	 */
	public static void main(String[] args) {

		// input string
		String str = "this is a java";

		// Initialize a variable to count the total number of characters
		int totalCount = 0;

		// Loop through each character in the string
		for (int i = 0; i < str.length(); i++) {
			// Check if the current character is not a space (' ')
			if (str.charAt(i) != ' ')
				// If not a space, increment the total count
				totalCount++;
		}
		// Print the total number of characters in the string
		System.out.println("total no.of chars: " + totalCount);
	}

}
