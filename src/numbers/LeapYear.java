package numbers;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();

		// logic to check year is leap year or not
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("Leap year");
		} else if ((year % 100) != 0 && (year % 400 == 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("not a leap year");
		}
		sc.close();
	}

}
