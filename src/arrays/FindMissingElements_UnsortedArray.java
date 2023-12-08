package arrays;

import java.util.HashSet;

public class FindMissingElements_UnsortedArray {

	public static void findMissingElements(int[] array, int start, int end) {
		HashSet<Integer> set = new HashSet<>();

		// add elements from the array to set
		for (int num : array) {
			set.add(num);
		}

		System.out.println("Missing elements: ");

		// check the missing elements in the range [start, end]
		for (int i = start; i <= end; i++) {
			if (!set.contains(i)) {
				System.out.println(i + " ");
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 10, 5, 4, 1, 6 };

		int start = 1;

		int end = 10;

		findMissingElements(a, start, end);
	}

}
