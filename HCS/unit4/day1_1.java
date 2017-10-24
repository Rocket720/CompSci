package unit4;

import java.util.Scanner;

public class day1_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 grades");
		double one = input.nextDouble();
		double two = input.nextDouble();
		
		if(((one+two)/2) > 90) {
			System.out.println("Your average is " + ((one+two)/2));
			System.out.println("Great job!");
		}
		else if(((one+two)/2) < 90) {
			System.out.println("Your average is " + ((one+two)/2));
			System.out.println("You are a failure");
		}

	}

}
