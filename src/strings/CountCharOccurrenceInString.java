package strings;

public class CountCharOccurrenceInString {

	public static void main(String[] args) {

		String str = "this is a test program";
		
		int length = str.length();
		
		int replaceChar = str.replace("t", "").length();
		
		int totalCount = length-replaceChar;
		
		System.out.println("total count char 'a' : "+totalCount);
		

	}

}
