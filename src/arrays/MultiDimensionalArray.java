package arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int a[][] = new int [2][2];
		
		a[0][0] = 2;
		a[0][1] = 3;
		
		a[1][0] = 4;
		a[1][1] = 5;
		
		System.out.println(Arrays.deepToString(a));
	}

}
