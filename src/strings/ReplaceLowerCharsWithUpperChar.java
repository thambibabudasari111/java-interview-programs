package strings;

public class ReplaceLowerCharsWithUpperChar {

	public static void main(String[] args) {

		String str = "Great Power";
		
		StringBuffer br = new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			//check for the lower case character
			if(Character.isLowerCase(str.charAt(i)))
			{
				//convert into upper case using toUpperCase() method
				br.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			
			//check for the upper case character
			else if(Character.isUpperCase(str.charAt(i)))
			{
				//convert upper case to lower case
				br.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after case conversion: "+br);
		
		
	}

}
