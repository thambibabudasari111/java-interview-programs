package strings;

import java.util.HashSet;

public class LongestSubString_Using_HashSet {
	/*
	 * HashSet Initialization:
	 * 
	 * HashSet<Character> set = new HashSet<>();: Initializes a HashSet to keep
	 * track of unique characters in the current substring. 
	 * 
	 * String Initialization:
	 * 
	 * String longestOverall = "";: Initializes a string to store the longest
	 * overall substring. String longestTillNow = "";: Initializes a string to store
	 * the current longest substring without repeating characters. 
	 * 
	 * Loop Through Input String:
	 * 
	 * for (int i = 0; i < str.length(); i++) {: Iterates through each character in
	 * the input string. 
	 * 
	 * Check for Repeating Characters:
	 * 
	 * char c = str.charAt(i);: Gets the current character. if (set.contains(c)) {:
	 * Checks if the current character is already present in the current substring.
	 * 
	 * Reset Substring and HashSet:
	 * 
	 * longestTillNow = "";: Resets the current substring. set.clear();: Clears the
	 * HashSet to start a new substring. 
	 * 
	 * Update Substring and HashSet:
	 * 
	 * set.add(c);: Adds the current character to the HashSet. longestTillNow =
	 * longestTillNow + c;: Adds the current character to the current substring.
	 * 
	 * Update Overall Longest Substring:
	 * 
	 * if (longestTillNow.length() > longestOverall.length()) {: Updates the overall
	 * longest substring if the current substring is longer. 
	 * 
	 * Return Result:
	 * 
	 * return longestOverall;: Returns the longest substring without repeating
	 * characters.
	 */
	
	public static void main(String[] args) {

		String str = "abcdab abcd df sdfl";
		
		System.out.println(longestSubString(str));
	}
	
	public static String longestSubString(String str)
	{
		// HashSet to keep track of unique characters in the current substring
		HashSet<Character> set = new HashSet<>();
		
		// Strings to store the longest overall substring and the current longest substring
		String longestOverall="";
		String longestTillnow="";
		
		// Iterate through each character in the input string
		for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			
			// Check if the current character is already present in the current substring
			if(set.contains(c))
			{
				// If yes, reset the current substring and clear the HashSet
				longestTillnow="";
				set.clear();
			}
			
			// Add the current character to the HashSet and the current substring
			set.add(c);
			longestTillnow = longestTillnow + c;
			
			// Update the overall longest substring if the current substring is longer
			if(longestTillnow.length()>longestOverall.length())
			{
				longestOverall = longestTillnow;
			}
		}
		// Return the longest overall substring without repeating characters
		return longestOverall;
		
	}

}
