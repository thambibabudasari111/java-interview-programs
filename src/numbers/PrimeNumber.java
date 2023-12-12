package numbers;

import java.util.Scanner;

public class PrimeNumber {

	/*
	 * Prime number is a number that is greater than 1 and divided by 1 or itself
	 * only. In other words, prime numbers can't be divided by other numbers than
	 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	 */
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int count = 0;
		
		if(n>1)
		{
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}
		
		sc.close();
		
		
	}

}
