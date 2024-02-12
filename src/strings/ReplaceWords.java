package strings;

public class ReplaceWords {

	public static void main(String[] args) {
		
		String str = "This increased support for RED quality writing, allied BLUE with the book-like Convenience and RED tactility of smartphones and tablets, BLUE means there has Never been a RED better time for reading BLUE online. The remaining RED task is to make the writing itself a BLUE joy to read.";
	
		System.out.println(str);
		// Replace "RED" with a placeholder to prevent accidental replacement
        String temp = str.replaceAll("RED", "###");
        
        System.out.println(temp);

        // Replace "BLUE" with "RED"
        temp = temp.replaceAll("BLUE", "RED");

        // Replace the placeholder "###" with "BLUE"
        String result = temp.replaceAll("###", "BLUE");

        // Output the result
        System.out.println(result);
		
	}
}
