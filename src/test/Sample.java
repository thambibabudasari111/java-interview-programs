package test;

import java.util.HashSet;

public class Sample {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,2,3,4,5,6,6,4};

		boolean flag = false;
		//using HashSet: because HashSet will not allow duplicates
		HashSet<Integer> elements = new HashSet<>();
		
		for(Integer a:arr)
		{
			if(elements.add(a)==false)
			{
				System.out.println("duplicate element found: "+a);
				flag = true;
			}
		}
		
		if(flag==false)
			System.out.println("no duplicate elements");
		
		
	}

}
