package arrays;

public class FindMissingNumbersInArray {

	/*
	 * 1. Array should not have duplicates
	 * 2. Array no need to be in sorted order
	 * 3. values should be in range
	 */
	public static void main(String[] args) {

		int a[] = {1,3,4,5,6};
		
		int sum1=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		
		System.out.println("sum of elements in an array: "+sum1);
		
		int sum2=0;
		
		for(int i=1; i<=6; i++)
		{
			sum2=sum2+i; 	
		}
		
		System.out.println("sum of range of elements in array:"+sum2 );
		
		System.out.println("missing element: "+(sum2-sum1));
		
		
		
		
		
	}

}
