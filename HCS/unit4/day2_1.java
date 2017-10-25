package unit4;

import java.util.Scanner;

public class day2_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter grades");
		double g1 = input.nextDouble();
		double g2 = input.nextDouble();
		double avg = (g1+g2)/2;
		
		if(avg >= 90 && avg <= 100) {
			System.out.println("Average is " + avg);
			System.out.println("You got an A");
		}
		else if(avg >= 80 && avg <= 90) {
			System.out.println("Average is " + avg);
			System.out.println("You got an B");
		}
		else if(avg >= 70 && avg <= 80) {
			System.out.println("Average is " + avg);
			System.out.println("You got an C");
		}
		else if(avg >= 60 && avg <= 70) {
			System.out.println("Average is " + avg);
			System.out.println("You got an D");
		}
		else {
			System.out.println("Average is " + avg);
			System.out.println("You got an F");
		}
		input.close();
	}

}
