package arrays;

public class CopyAllElementsFrom1ArrayToAnother {

	public static void main(String[] args) {

		// array initialization
		int arr1[] = new int[] { 1, 2, 4, 5 };

		// create another array with size of of arr1
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// display array 1 elements
		System.out.println("elements of array 1");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		// display array2 elements
		System.out.println("elements of array 2");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
