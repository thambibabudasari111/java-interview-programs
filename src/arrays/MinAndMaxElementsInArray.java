package arrays;

public class MinAndMaxElementsInArray {

	public static void main(String[] args) {

		int a[] = {10, 29, 39, 12, 45, 54, 21,9,};
		
		int max = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum element: "+max);
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Minimum element: "+min);
		
		
		
		
		
		
		
		
	}

}
