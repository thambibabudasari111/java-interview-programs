package strings;

public class FindLongestRepeatSequenceInString {

	/*
	 * The code uses a brute-force approach
	 * 
	 * Input String:
	 * 
	 * String str = "acbdfghybdf";: Defines the input string. 
	 * 
	 * Nested Loops:
	 * 
	 * The code uses nested loops to iterate through all possible pairs of
	 * substrings (i, j), where j > i. 
	 * 
	 * Longest Common Prefix (LCP) Function:
	 * 
	 * The lcp function calculates the Longest Common Prefix of two strings. Update
	 * Longest Repeated Substring (LRS):
	 * 
	 * For each pair of substrings, the code calculates the LCP using the lcp
	 * function. If the length of the LCP is greater than the length of the current
	 * Longest Repeated Substring (lrs), it updates lrs with the new value. 
	 * 
	 * Print Result:
	 * 
	 * After the nested loops, the code prints the Longest Repeated Substring found.
	 */
	 
	public static void main(String[] args) {

		// Input string
		String str = "acbdfghybdf";
		
		// Variable to store the Longest Repeated Substring (LRS)
		String lrs = "";
		
		// Get the length of the input string
		int n=str.length();
		
		// Iterate through all possible pairs of substrings
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				// Find the Longest Common Prefix (LCP) of substrings starting from positions i and j
				String x = lcp(str.substring(i,n),str.substring(j,n));
				
				// If the LCP is longer than the current LRS, update the LRS
				if(x.length()>lrs.length())
				{
					lrs=x;
				}
			}
			
		}
		// Print the Longest Repeated Substring
		System.out.println("longest repeared sequence: "+lrs);
	}
	
	// Function to find the Longest Common Prefix (LCP) of two strings
	public static String lcp(String s, String t)
	{
		// Get the minimum length of the two strings
		int n = Math.min(s.length(), t.length());
		
		// Iterate through the characters of the string
		for(int i=0; i<n; i++)
		{
			// If characters at the same position are different, return the substring up to that position
			if(s.charAt(i)!=t.charAt(i))
				return s.substring(0,i);
		}
		
		// If all characters match, return the shorter string
		return s.substring(0,n);
	}

}
