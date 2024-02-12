package strings;

public class FindMostRepeatedWordInString {

	public static void main(String[] args) {

		// Initializing a string with the given content
		String str = "this is a string text and the text  a normal text and not  also ";
		
		// Calling the method to find and print the most repeated word
		mostRepeatedWord(str);
		
	}
	
	// Method to find and print the most repeated word in a given string
	public static void mostRepeatedWord(String input)
	{
		// Check if the input string is null or empty
		if(input==null || input.isEmpty())
		{
			System.out.println("the given string is empty or null");
		}
		
		// Splitting the input string into an array of words based on space (" ") delimiter
		String words[] = input.split(" ");
		
		// Initializing variables to store the most repeated word and its count
		String maxOccurrence="";
		
		int temp=0;
		
		// Loop through each word in the array
		for(int i=0; i<words.length;i++)
		{
			// Initialize a counter for the current word
			int counter=0;
			
			// Loop through the remaining words in the array
			for(int j=1; j<words.length;j++)
			{
				// Check if the current word is equal to any of the remaining words
				if(words[i].equals(words[j]))
				{
					// Increment the counter for each occurrence of the current word
					counter++;
				}
			}
			
			// Update the temporary variable with the maximum value between the current counter and the previous maximum
			temp = Math.max(temp, counter);
			
			// If the counter is greater than or equal to the current maximum counter, update the most repeated word
			if(counter>=temp)
			{
				maxOccurrence=words[i];
			}
		}
		
		 //Display the most repeated word and its count in the string
		System.out.println("max occurrence of word in string is: "+maxOccurrence+" and it is repeated "+temp+" times.");
		
	}
	

}
