package characters;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a character");

		char c = sc.next().charAt(0);

		boolean isVowel = false;
		switch (c) {
		case 'a':

		case 'e':
		case 'i':
		case 'o':

		case 'u':
		case 'A':
		case 'E':

		case 'I':
		case 'O':
		case 'U':
			isVowel = true;

		}

		if (isVowel) {
			System.out.println(c + " is a vowel");
		} else {
			System.out.println(c + " is not a vowel");
		}
		sc.close();
	}

}
