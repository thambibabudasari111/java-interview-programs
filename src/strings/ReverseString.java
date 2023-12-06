package strings;

public class ReverseString {

	public static void main(String[] args) {

		String str = "this is a java program";;
		
		String revString = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			revString += str.charAt(i);
		}
		
		System.out.println("Reverse string: "+revString);
	}

}
