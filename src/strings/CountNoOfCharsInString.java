package strings;

public class CountNoOfCharsInString {

	/*
	 * String str = "this is thambi babu";:
	 * 
	 * Initializes a string variable str with the value "this is thambi babu". int
	 * countChars = 0;:
	 * 
	 * Initializes a variable countChars to store the count of non-space characters.
	 * It is initially set to 0. for (int i = 0; i < str.length(); i++) {:
	 * 
	 * Starts a for loop to iterate through each character in the string str. if
	 * (str.charAt(i) != ' ') {:
	 * 
	 * Checks if the current character at index i is not a space. countChars++;:
	 * 
	 * If the current character is not a space, increments the countChars variable.
	 * } 
	 * // End of if:
	 * 
	 * Ends the if statement. } 
	 * // End of for loop:
	 * 
	 * Ends the for loop. System.out.println("Total non-space characters: " +
	 * countChars);:
	 * 
	 * Prints the total count of non-space characters to the console.
	 */
	public static void main(String[] args) {

		// Input string
		String str = "this is thambi babu";

		// Variable to store the count of non-space characters
		int countChars = 0;

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			// Check if the current character is not a space
			if (str.charAt(i) != ' ') {
				// If not a space, increment the count of non-space characters
				countChars++;
			}
		}
		// Print the total count of non-space characters
		System.out.println("total characters: " + countChars);
	}

}
