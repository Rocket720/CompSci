package unit4;

import java.util.Scanner;

public class day2_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		double num = input.nextDouble();
		
		System.out.println("Enter a multiple");
		double mul = input.nextDouble();
		
		if(num%mul == 0) {
			System.out.println(mul + " is a multiple of " + num);
		}
		else {
            System.out.println(mul + " is not a multiple of " + num);
        }
		
	}

}
