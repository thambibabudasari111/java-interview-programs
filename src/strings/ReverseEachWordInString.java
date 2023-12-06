package strings;

public class ReverseEachWordInString {

	/*
	 * Reverse a given string word by word
	 * 
	 * Input: my name is thambi babu
	 * 
	 * Output: ym eman si ibmaht ubab
	 */
	
	public static void main(String[] args) {

		String str = "my name is thambi babu";
		
		//split string into words
		/*String[] words = str.split(" ");
		
		String revString = "";
		
		for(String w:words)
		{
			String revWords = "";
			
			for(int i=w.length()-1;i>=0; i--)
			{
				revWords += w.charAt(i); 
			}
			revString += revWords+" ";
		}
		
		System.out.println(revString);
		*/
		
		
		//Approach 2: Using built-in method: StringBuilder class
		String[] words = str.split("\\s");
		String revString = "";
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			revString = revString+sb.toString()+" ";
		}
		
		System.out.println(revString);
		
		
	}

}
