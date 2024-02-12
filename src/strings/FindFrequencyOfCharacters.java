package strings;

public class FindFrequencyOfCharacters {

	public static void main(String[] args) {

		// Initializing a string with the given content
		String str = "this is a java program";
		
		// Initializing an array to store the frequency of each character in the string
		int freq[] = new int[str.length()];
		
		// Converting the entire string to lowercase to make the comparison case-insensitive
		str = str.toLowerCase();
		
		// Converting the string to a character array
		char ch[] = str.toCharArray();
		
		// Loop through each character in the array
		for(int i=0;i<str.length();i++)
		{
			// Initializing the frequency of the current character to 1
			freq[i]=1;
			
			// Loop through the remaining characters in the array
			for(int j=i+1;j<str.length();j++)
			{
				// Check if the current character is equal to any of the remaining characters
				if(ch[i]==ch[j])
				{
					// Increment the frequency of the current character for each duplicate occurrence
					freq[i]++;
					
					// Mark the duplicate character as '0' to avoid counting it again
					ch[j]='0';
				}
			}
			
			
		}
		
		//display each character and their occurrences
		System.out.println("character and their corresponding occurrencies");
		for(int i=0; i<freq.length;i++)
		{
			// Check if the current character is not a space and not marked as '0'
			if(ch[i]!=' '&& ch[i]!='0')
			// Print the character and its frequency
			System.out.println(ch[i]+" "+freq[i]);
		}
	}

}
