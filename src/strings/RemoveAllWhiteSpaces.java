package strings;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {

		String str = "this is a   sample java program ";
		
		str = str.replaceAll("\\s+", "");
		
		System.out.println("After removing spaces: "+str);
	}

}
