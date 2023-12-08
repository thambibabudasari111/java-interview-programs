package arrays;

public class SearchElement_LinearSearch {

	// search an array element using linear search
	public static void main(String[] args) {

		int a[] = { 30, 10, 29, 20, 15 };

		int searchElement = 10;

		boolean flag = false;
		for (int i = 0; i < a.length; i++) 
		{
			if (searchElement == a[i]) 
			{
				System.out.println("Search element found: " + i);
				flag = true;
				break;
			}
		}

		if (flag == false)
			System.out.println("Search element not found");

	}

}
