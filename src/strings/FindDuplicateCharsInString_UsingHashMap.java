package strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsInString_UsingHashMap {

	public static void main(String[] args) {

		// Given string
		String str = "this is a string";
		
		// Remove spaces from the string
		str = str.replace(" ", "");
		
		// Convert the string to a character array
		char ch[] = str.toCharArray();
		
		// Create a HashMap to store character frequencies
		Map<Character, Integer>charFreq = new HashMap<Character, Integer>();
		
		// Count the frequency of each character in the string
		for(char  c:ch)
		{
			// If the character already exists in the map, increment its count
			if(charFreq.containsKey(c))
			{
				charFreq.put(c, charFreq.get(c)+1);
			}
			else
			{
				// If the character does not exist in the map, add it with count 1
				charFreq.put(c, 1);
			}
		}
		
		// Output: Display duplicate characters in the string
		System.out.println("duplicate chars in a string");
		for(Character entry:charFreq.keySet())
		{
			if(charFreq.get(entry)>1)
			{
				System.out.println("character: "+entry+" - "+charFreq.get(entry));
			}
		}
	}

}
