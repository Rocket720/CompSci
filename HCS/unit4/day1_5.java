package unit4;

import java.util.Scanner;

public class day1_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value ");
		double val = input.nextDouble();
		
		if(val>0) {
			System.out.println("Circumference: " + (val*2*3.141592653589));
			System.out.println("Area: " + (val*val*3.141592653589));
		}
		else {
			System.out.println("Are u dum");
		}
		
		
	}

}
