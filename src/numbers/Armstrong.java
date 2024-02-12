package numbers;

import java.util.Scanner;

public class Armstrong {

	/*
	 * An Armstrong number is a positive m-digit number that is equal to the sum of
	 * the mth powers of their digits. It is also known as pluperfect, or Plus
	 * Perfect, or Narcissistic number.
	 * 
	 * Armstrong Number Example
	 * 
	 * 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
	 * 
	 * 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
	 * 
	 * 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
	 */

	static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;

		// assigning n into temp variable
		temp = n;

		// loop execute until the condition false
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}

		temp = n;

		while (temp > 0) {
			// determines the last digit from the number
			last = temp % 10;
			sum = (int) (sum + (Math.pow(last, digits)));

			// remove last digit
			temp = temp / 10;
		}

		if (n == sum)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.print("armstrong numbers up to " + num + " are");

		for (int i = 0; i <= num; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + ",");
			}
			sc.close();
		}
	}

}
