package numbers;

import java.util.Scanner;

public class CheckNumEvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd numbeer");
		}

		sc.close();
	}

}
