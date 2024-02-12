package arrays;

public class FindLargestElementInArray {

	public static void main(String[] args) {

		int arr[] = {10,20,53,55,34,22};
		
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("largest element in an array: "+largest);
	}

}
