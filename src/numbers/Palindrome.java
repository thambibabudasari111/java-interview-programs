package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int number = sc.nextInt();

		int reverseNumber = 0;

		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}

		System.out.println(reverseNumber);
		sc.close();
	}

}
