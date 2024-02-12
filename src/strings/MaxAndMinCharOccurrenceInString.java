package strings;

public class MaxAndMinCharOccurrenceInString {

	public static void main(String[] args) {

		String str = "grass is greener on the other side";
		
		int freq[] = new int[str.length()];
		
		char minChar=str.charAt(0), maxChar=str.charAt(0);
		
		int i,j,min,max;
		
		//convert string into char array
		char arr[] = str.toCharArray();
		
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1; j<str.length();j++)
			{
				if(arr[i]==arr[j] && arr[i] != ' ' && arr[i]!=0)
				{
					freq[i]++;
					
					//set arr[i] to 0 to avoid printing visited characters
					arr[j]=0;
				}
			}
		}
		
		//determine minimum and maximum occurring characters
		min=max=freq[0];
		
		for(i=0; i<freq.length; i++)
		{
			//if min is greater than frequency of a character then
			//store frequency in min and corresponding character in minChar
			if(min>freq[i] && freq[i]!='0')
			{
				min=freq[i];
				minChar = arr[i];
			}
			
			//if max is less than frequency of a character then
			//store frequency in max and corresponding character in maxChar
			if(max<freq[i])
			{
				max=freq[i];
				maxChar=arr[i];
			}
		}
		
		System.out.println("minimum char occurrence: "+minChar);
		System.out.println("maximum char occurrence: "+maxChar);
	}

}
