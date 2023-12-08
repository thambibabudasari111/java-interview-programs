package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort_BuiltinMethods {

	public static void main(String[] args) {

		//Approach 1
		
		int a[] = {30, 29, 12, 45, 59};
		
		System.out.println("Before sorting: "+Arrays.toString(a));
		
		//Arrays.parallelSort(a);
		
		
		//Approach 2
		//Arrays.sort(a);
		
		//Approach 3: Sorting elements in reverse order
		Integer arr[] = {30, 29, 12, 45, 59};
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		System.out.println("After sorting: "+Arrays.toString(arr));
		
		
		
		
	}

}
