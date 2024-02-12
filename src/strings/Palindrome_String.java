package strings;

public class Palindrome_String {

	public static void main(String[] args) {

		//str = madam, malayalam
		
		String str = "madam";
		
		String orgString = str;
		String revString = "";
		
		
		for(int i=str.length()-1; i>=0; i--)
		{
			revString = revString + str.charAt(i);
		}
		
		System.out.println("reverse string: "+revString);
		
		if(revString.equals(orgString))
		
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
