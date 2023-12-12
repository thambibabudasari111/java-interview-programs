package arrays;

public class FindElementEqualIndex {

	public int matchElement(int[] nums)
	{
		if(nums.length==0)
		{
			return 0;
		}
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==i)
			{
				return nums[i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {

		FindElementEqualIndex obj = new FindElementEqualIndex();
		int a[] = {-4,-2,2,4,6,9};
		
		
	}

}
