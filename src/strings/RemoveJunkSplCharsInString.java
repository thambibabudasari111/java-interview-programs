package strings;

public class RemoveJunkSplCharsInString {

	public static void main(String[] args) {

		String str = "@#!@$@#$!wefhsfdjksdfsf$@$2jskdfkjsdkjbsdfk%##@'$98u9809sdfdsfdsf'";
		
		String replacedString = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("after removing spl chars and junk: "+replacedString);
	}

}
