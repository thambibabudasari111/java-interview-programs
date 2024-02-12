package input_and_output;

import java.util.Scanner;

public class InputFromScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		String input = sc.nextLine();

		System.out.println("Welcome " + input);

		sc.close();
	}

}
