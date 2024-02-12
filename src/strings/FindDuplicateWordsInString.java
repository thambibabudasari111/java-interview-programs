package strings;

public class FindDuplicateWordsInString {

	public static void main(String[] args) {

		// Initializing a string with the given content
		String str = "this is test program of java program text text";
		
		// Converting the entire string to lowercase to make the comparison case-insensitive
		str = str.toLowerCase();
		
		// Splitting the string into an array of words based on space (" ") delimiter
		String words[] = str.split(" ");
		
		// Printing a message indicating that duplicate words will be displayed
		System.out.println("duplicate words in given string");
		
		// Loop through each word in the array
		for(int i=0;i<words.length;i++)
		{
			// Initialize a counter for the current word
			int count=1;
			
			// Loop through the remaining words in the array
			for(int j=i+1; j<words.length; j++)
			{
				// Check if the current word is equal to any of the remaining words
				if(words[i].equals(words[j]))
				{
					// Increment the counter for duplicate occurrence
					count++;
					
					// Mark the duplicate word as "0" to avoid printing it again
					words[j]="0";
				}
			}
			
			// Check if the count of the current word is greater than 1 and the word is not marked as a duplicate
			if(count>1 && words[i]!="0")
			{
				// Print the duplicate word
				System.out.println(words[i]);
			}
		}
	}

}
