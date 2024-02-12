package strings;

public class FindDuplicateCharsInString {

	public static void main(String[] args) {

		String str = "this is a string";

		//remove the space from the string
		str = str.replaceAll(" ", "");

		//convert the given string into character array
		char ch[] = str.toCharArray();
		
		//loop to check the frequency of each character
		for(int i=0;i<ch.length;i++)
		{
			//initializing count variable to 1
			int count=1;
			
			//loop to check the next character (i+1) after 1st character and compare
			for(int j=i+1;j<ch.length;j++)
			{
				//condition to check if the first character is equal to second character or not
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					//if the character matches, then increments it's count
					count++;
					
					//setting ch[j] to empty or 0 to avoid the repeated (visited) character again
					ch[j]=' ';
				}
			}
			
			//if the counter is greater than 1 and not equal to a space or 0 then displaying the character and it's count
			if(count>1&& ch[i]!=' ')
			{
				System.out.println("duplicate chars: "+ch[i]+" count: "+count);
			}
			
		}
		
		
	}

}
