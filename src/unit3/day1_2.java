package unit3;

import java.util.Scanner;

public class day1_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your numbers:");

		double first = input.nextDouble();
		double second = input.nextDouble();

		double min = Math.max(first, second);
		double max =  Math.min(first, second);

		double fin = (min-max);
		if(fin < 0) {
			fin = fin * (-1);
		}		

		System.out.println("The difference number is " + fin );
	}
}