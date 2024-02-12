package strings;

public class ReverseWordsOfSentence {

	public static void main(String[] args) {

		String str = "thambi babu dasari";
		
		String[] words = str.split(" ");
		
		String revWords="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			revWords = revWords + words[i]+" ";
		}
		
		System.out.println("reverse words: "+revWords);
	}

}
