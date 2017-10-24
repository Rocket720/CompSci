package unit3;

import java.util.Scanner;

public class day2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int one =(int) (Math.random()*11);
		int two =(int) (Math.random()*11);
		System.out.println(one + " + " + two);

		double answer = input.nextDouble();
		
		System.out.println("Correct answer is " + (one+two));
	}

}
