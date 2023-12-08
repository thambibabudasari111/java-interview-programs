package arrays;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String arr[] = {"java", "python", "selenium", "c#", "c++","python", "java"};
		
		boolean flag = false;
		
		//Approach 1:
		
		/*
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found duplicate element: "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}
		*/
		
		//Approach 2: using HashSet
		HashSet<String>elements = new HashSet<>();
		
		for(String ele:arr)
		{
			if(elements.add(ele)==false)
			{
				System.out.println("duplicate element found: "+ele);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("No duplicate element found");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
