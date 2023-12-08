package arrays;

import java.util.HashSet;

public class FindMissingElement_UsingHashSet {

	/*
	 * 1. The findMissingElements method takes an array of integers (array) and the
	 * maximum value (N) in the array range.
	 * 
	 * 2. It uses a HashSet to efficiently store and check for the presence of
	 * elements 3. The elements from the array are added to the set 4. The method
	 * then iterates from 1 to N and checks for missing elements by verifying if
	 * each element is present in the set. 5. The missing elements are printed to
	 * the console.
	 */
	public static void findMissingElements(int[] array, int n) {
		HashSet<Integer> set = new HashSet<>();

		// add elements from array to set
		for (int num : array) {
			set.add(num);
		}

		System.out.println("Missing elements: ");

		// check for missing elements from 1 to N
		for (int i = 1; i <= n; i++) {
			if (!set.contains(i)) {
				System.out.println(i + " ");
			}
		}

		System.out.println();

	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 6, 8 };

		int n = 8;

		findMissingElements(a, n);
	}

}
