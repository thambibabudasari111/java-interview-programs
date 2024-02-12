package strings;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "my name is thambi babu";

		String result = reverseWords(str);
		System.out.println(result);
	}

	public static String reverseWords(String str) {
		String words[] = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i > 0) {
				sb.append(" "); // add spaces between words
			}
		}
		return sb.toString();
	}

}
