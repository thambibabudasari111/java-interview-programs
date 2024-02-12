package arrays;

public class FindFrequencyOfEachElementInAnArray {

	public static void main(String[] args) {

		//initialize array
		int arr[] = {1,2,3,1,4,5,7,3,4,5};
		
		//array fr will store frequencies of element
		int[] fr = new int[arr.length];
		
		int visited = -1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
					//to avoid same element again
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
				fr[i]=count;
		}
		
		//display the frequency of each element 
		System.out.println("----------------------");
		System.out.println("Element  | Frequency ");
		System.out.println("-----------------------");
		
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visited)
			{
				System.out.println("  "+arr[i]+ "  |  "+fr[i]);
			}
		}
		System.out.println("-----------------------------");
		
	}

}
