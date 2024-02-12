package arrays;

public class SortArray_AscendingOrder {

	public static void main(String[] args) {

		//initialize array
		int arr[] = {5,2,8,7,1};
		
		int temp = 0;
		
		//original array
		System.out.println("original array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//sort array in ascending order
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		
		//display sorted array
		System.out.println("array after sorting in ascending order");
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
