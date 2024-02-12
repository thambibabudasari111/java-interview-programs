package strings;

public class ReplaceSpaceWithSplCharInString {

	public static void main(String[] args) {

		String str = "thambi babu dasari";
		
		char c = '@';
		
		String afterAddSplChar = str.replace(' ', c);
		
		System.out.println("after replacing space with spl char: "+afterAddSplChar);
	}

}
