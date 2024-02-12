package numbers;

import java.util.Scanner;

public class AreaOfCircle {

	/*
	 * program to calculate area of the circle
	 * 
	 * formula: (PI*radius*radius)
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of circle");
		double radius = sc.nextDouble();

		System.out.println("area of the circle having the radius " + radius + " is " + (Math.PI * radius * radius));
		sc.close();
	}

}
