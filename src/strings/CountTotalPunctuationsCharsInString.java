package strings;

public class CountTotalPunctuationsCharsInString {

	/*
	 * Variable Initialization:
	 * 
	 * int count = 0;: Initializes an integer variable count to count the number of
	 * punctuations. Given Input String:
	 * 
	 * String str = "He said, 'The mailman loves you.' I heard with my own ears";:
	 * Initializes a string variable str with a sample input string. Loop through
	 * Characters:
	 * 
	 * for (int i = 0; i < str.length(); i++) {: Starts a loop that iterates through
	 * each character in the string. Character Check:
	 * 
	 * The series of if statements checks whether the current character is one of
	 * the specified punctuation marks. Increment Count:
	 * 
	 * count++;: If the current character is a punctuation mark, increments the
	 * count. Print Result:
	 * 
	 * System.out.println("Total number of punctuations in the string: " + count);:
	 * Prints the total number of punctuations in the string after the loop.
	 */
	public static void main(String[] args) {

		// Initialize a variable to count the number of punctuations
		int count = 0;
		
		// Given input string
		String str = "He said, 'The mailman loves you.' I heared with my own ears";
		
		// Loop through each character in the string
		for(int i=0; i<str.length(); i++)
		{
			// Check whether the given character is a punctuation mark
			if(str.charAt(i)=='!' || str.charAt(i)==','|| str.charAt(i)==';' || str.charAt(i)=='.' 
					||str.charAt(i)=='?' || str.charAt(i)=='-' || str.charAt(i)=='\'' || str.charAt(i)=='\"'
					|| str.charAt(i)==':')
			{
				// If the character is a punctuation mark, increment the count
				count++;
			}
		}
		// Print the total number of punctuations in the string
		System.out.println("Total no.of punctuations in the string: "+count);
	}

}
