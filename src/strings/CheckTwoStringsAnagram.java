package strings;

import java.util.Arrays;

public class CheckTwoStringsAnagram {

	/*
	 * Two Strings are called the anagram if they contain the same characters. 
	 * However, the order or sequence of the characters can be different.
	 * 
	 * Algorithm:
	 * 
	 * STEP 1: START
		STEP 2: DEFINE str1 = "Brag", str2 = "Grab".
		STEP 3: CONVERT str1, str2 to lower-case.
		STEP 4: IF length of str1, str2 are not equal then PRINT "Not Anagram"
			else go to Step 5
		STEP 5: CONVERT str1, str2 to character arrays.
		STEP 6: SORT the arrays.
		STEP 7: COMPARE the arrays, IF equal then PRINT "Anagram"
		else
		PRINT "Not Anagram"
		STEP 8: END
	 */
	public static void main(String[] args) {

		String str1 = "Brag", str2="Grab";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//Checking for the length of strings equal or not
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the string are not anagram");
		}
		else
		{
			//convert the strings to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			//sorting both the arrays using built-in method sort()
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			//compare both arrays using equals() method
			if(Arrays.equals(string1, string2)==true)
			{
				System.out.println("Both the string are anagram");
			}
			else
			{
				System.out.println("Both strings are not anagaram");
			}
		}
		
	}

}
