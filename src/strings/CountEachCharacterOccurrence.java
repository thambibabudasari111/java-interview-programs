package strings;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterOccurrence {

	public static void main(String[] args) {

		String str = "this is a test program";
		countCharOccurrence(str);
	}
	
	public static void countCharOccurrence(String text)
	{
		//create a HashMap to store character frequencies
		Map<Character, Integer> charFreqMap = new HashMap<>();
		
		//remove the spaces and convert the string into lower case
		text = text.toLowerCase();
		
		text = text.replace(" ", "");
		
		//convert the string into character array
		char ch[] = text.toCharArray();
		
		//iterate through the character and count their occurrences
		for(char c:ch)
		{
			if(charFreqMap.containsKey(c))
			{
				//if the character is already in the map, increase it's count
				charFreqMap.put(c, charFreqMap.get(c)+1);
			}
			else
			{
				//otherwise, add the character to the map with count of 1
				charFreqMap.put(c, 1);
			}
		}
		
		//print character frequencies
		for(Map.Entry<Character, Integer> entry: charFreqMap.entrySet())
		{
			System.out.println("Character: "+entry.getKey()+" - Frequency:  "+entry.getValue());
		}
		
		
		
	}

}
