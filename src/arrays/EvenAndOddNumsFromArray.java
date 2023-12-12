package arrays;

public class EvenAndOddNumsFromArray {

	public static void main(String[] args) {

		int a[] = {3,4,9,5,6,7};
		
		//extracting even numbers
		System.out.println("==========================");
		System.out.println("Even numbers in an array: ");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("============================");
		System.out.println("Odd numbers in an array");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		
		
		
	}

}
