package strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurrenceOfWord_UsingHashMap {

	public static void main(String[] args) {

		String str = "this is a simple text his text is a text and text can have text";
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word:str.split(" "))
		{
			if(map.get(word)==null)
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, map.get(word)+1);
			}
		}
		
		String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println("Max occurrence word in string is: "+key+" repeated "+ map.get(key)+" times");
		
		
	}

}
