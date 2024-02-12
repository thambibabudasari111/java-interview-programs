package strings;

public class FindLargestAndSmallestWord {

	public static void main(String[] args) {
		
		String str = "this is a simple java program";
		
		//checking that the string length is 0, then it's a empty string
		if(str.length()==0)
		{
			System.out.println("empty string");
		}
		else
		{
			//calling the static method
			findLargestAndSmallestWord(str);
		}
		
	}
	
	public static void findLargestAndSmallestWord(String str)
	{
		//taking 2 string references smallest and largest and set to default initially
		String smallest="", largest="";
		
		//dividing the given string into words with a space delimiter
		String words[] = str.split(" ");
		
		//loop to verify the words one by one checking the condition
		for(int i=0;i<words.length;i++)
		{
			//if condition to check if the i equal to 0 then both largest and smallest words are starting word of string
			if(i==0)
			{
				largest=smallest=words[0];
			}
			
			//if any word length is less than the starting word then it's a smallest word
			else if(words[i].length()<smallest.length())
			{
				//storing the smallest word to variable smallest
				smallest = words[i];
			}
			//if any word length is greater than the starting word in a given string then it's a largest word  
			else if(words[i].length()>largest.length())
			{
				//storing largest word into variable largest
				largest=words[i];
			}
		}
		
		//print smallest and largest words
		System.out.println("largest word: "+largest);
		System.out.println("smallest word: "+smallest);
	}
}
