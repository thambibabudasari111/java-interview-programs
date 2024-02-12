package strings;

public class CountVowelsAndConsonants {

	/*
	 * Algorithm:
	 * 
	 * STEP 1: START 
	 * STEP 2: SET vCount =0, cCount =0 
	 * STEP 3: DEFINE string str = "This is a really simple sentence". 
	 * STEP 4: CONVERT str to lowercase 
	 * STEP 5:SET i =0. 
	 * STEP 6: REPEAT STEP 6 to STEP 8 UNTIL i<str.length() 
	 * STEP 7: IF any character of str matches with any vowel then vCount = vCount + 1. 
	 * STEP 8: IF any character excepting vowels lies BETWEEN a and z then cCount = cCount =+1.
	 * STEP 9: i = i + 1 
	 * STEP 10: PRINT vCount. 
	 * STEP 11: PRINT cCount. 
	 * STEP 12: END
	 */
	public static void main(String[] args) {

		int vCount=0, cCount=0;
		
		String str = "This is really a simple sentence";
		
		//convert string into lowercase
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='0' || str.charAt(i)=='u')
			{
				//increment vowels count
				vCount++;
			}
			
			else
			{
				if((str.charAt(i)>='a')&& (str.charAt(i)<='z'))
				{
					//increment constants count
					cCount++;
				}
			}
		}
		
		//print vowel count and consonants count
		System.out.println("Vowels: "+vCount+" Constants: "+cCount);
	}

}
