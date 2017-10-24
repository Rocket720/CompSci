package unit3;

import java.util.Scanner;

public class day1_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your numbers:");

		double first = input.nextDouble();
		double second = input.nextDouble();

		double min = Math.max(first, second);
		double max =  Math.min(first, second);
		System.out.println("The smallest number is " + min + " and the biggest number is " + max );	}
}