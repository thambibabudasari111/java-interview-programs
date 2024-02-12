package strings;

public class DivideStringIntoNEqualParts {

	/*
	 * Algorithm:
	 * 
	 * STEP 1: START
	STEP 2: DEFINE str = "aaaabbbbcccc"
	STEP 3: DEFINE len
	STEP 4: SET n =3
	STEP 5: SET temp = 0.
	STEP 6: chars = len/n
	STEP 7: DEFINE String[] equalstr.
	STEP 8: IF (len%n!=0)
	then PRINT ("String can't be divided into equal parts")
	else go to STEP 9
	STEP 9: SET i =0.
	STEP 10: REPEAT STEP 11 to STEP 14 UNTIL i<len
	STEP 11: DEFINE substring part.
	STEP 12: equalstr [temp] = part
	STEP 13: temp = temp + 1
	STEP 14: i = i + chars
	STEP 15: PRINT n
	STEP 16: SET i=0. REPEAT STEP 17 to STEP 18 UNTIL i<equalstr.length
	STEP 17: PRINT equalstr[i]
	STEP 18: i = i + 1
	STEP 19: END
	 */
	public static void main(String[] args) {
		
		// Given input string
		String str = "aaaabbbbcccc";
		
		//Stores the length of the string  
		int length =str.length();
		
		// n determines the variable that divides the string into 'n' equal parts
		int n=3;
		
		// Variables for temporary storage and calculating the length of each part
		int temp = 0, chars = length/n;
		
		 // Stores the array of strings  
		String[] equalStr = new String[n];
		
		// Check whether a string can be divided into n equal parts
		if(length%n!=0)
		{
			System.out.println("string can't be divide into "+n +" equal parts");
		}
		else
		{
			for(int i=0; i<length; i=i+chars)
			{
					// Divide the string into n equal parts using substring()
				String part = str.substring(i, i+chars);
				equalStr[temp] = part;
				temp++;
			}
			// Print n equal parts of the given string
			System.out.println(n+" equal parts of given string");
			for(int i=0; i<equalStr.length;i++)
			{
				System.out.println(equalStr[i]);
			}
		}
		
	}

}
