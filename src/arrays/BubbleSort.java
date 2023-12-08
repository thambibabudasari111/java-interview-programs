package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {10, 29, 8, 32, 23, 22};
		
		int len = a.length;
		
		int temp = 0;
		boolean flag=false;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
				
			}
			
		}
	
		System.out.println("sorted array: "+Arrays.toString(a));
	}

}
