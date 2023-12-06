package strings;

public class CountCharOccurrenceInString {

	public static void main(String[] args) {

		String str = "This is a test program";

		int length = str.length();

		int totalCount = str.replace("s", "").length();

		int count = 0;

		count = length - totalCount;
		System.out.println("Total count of character 's': " + count);

	}

}
