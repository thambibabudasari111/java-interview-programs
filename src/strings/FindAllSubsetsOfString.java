package strings;

public class FindAllSubsetsOfString {

	public static void main(String[] args) {

		
		String str = "this is a string";
		
		//Approach 1:
		/*
		 * for(int i=0;i<str.length();i++) 
		 * { 
		 * for(int j=i+1;j<str.length();j++) 
		 * {
		 * System.out.println(str.substring(i,j));
		 * } 
		 * }
		 */
		
		//Approach 2:
		int len = str.length();
		int temp=0;
		
		//total possible subsets of string of size n is n*(n+1)/2
		String arr[] = new String[len*(len+1)/2];
		
		//outer loop to maintain starting character
		for(int i=0;i<len; i++)
		{
			//inner loop add the next character every iteration for the subset to form and add it to the array
			for(int j=i; j<len; j++)
			{
				arr[temp] = str.substring(i,j+1);
				temp++;
			}
		}
		
		//this loop prints all the subsets formed from the string
		System.out.println("all subsets of string are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
