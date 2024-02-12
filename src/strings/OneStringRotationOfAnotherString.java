package strings;

public class OneStringRotationOfAnotherString {

	public static void main(String[] args) {

		String s1 = "abcdefgh";
		String s2 = "fghabcde";
		
		//check the length of two string equal or not
		if(s1.length()!=s2.length())
		{
			System.out.println("string 2 is not rotation of string 1");
		}
		
		else
		{
			s1 = s1.concat(s1);
			//check whether string2 is present in the string 1
			if(s1.indexOf(s2)!=-1)
			{
				System.out.println("second string is rotation of first string");
			}
			else
			{
				System.out.println("second string is not ration of first string");
			}
		}
		
	}

}
