package unit4;

import java.util.Scanner;

public class day1_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a score for Mike");
		double m = input.nextDouble();
		
		System.out.println("Enter a score for Rachel");
		double r = input.nextDouble();
		
		if(m>r) {
			System.out.println("Micheal scored higher than Rachel by " + (m-r));
		}
		else if(m<r) {
			System.out.println("Rachel scored higher than Micheal by " + (r-m));
		}
		
	}

}
