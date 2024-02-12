package numbers;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number 1: ");
		int num1 = sc.nextInt();

		System.out.println("enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("sum of first and second numbers:" + (num1 + num2));
		sc.close();
	}

}
