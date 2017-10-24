package unit4;

import java.util.Scanner;

public class day1_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Celsius");
		double cel = input.nextDouble();
		
		if(((1.8*cel)+32)<32) {
			System.out.println(cel + " is " + (((1.8*cel)+32)<32) + " in Farenheit");
			System.out.println("Grab dat jacket");
		}
		else if(((1.8*cel)+32)>32) {
			System.out.println(cel + " is " + (((1.8*cel)+32)<32) + " in Farenheit");
			System.out.println("Ditch the jacket");
		}
		
	}

}
