package unit3;

import java.util.Scanner;

public class UnitTest3_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int one = (int) (Math.random()*11);
		int dif = 10-one;
		int two = (int) ((Math.random()*(11-dif))+dif);

		System.out.println(one + " + " + two);
		
		String pause = input.next();
		
		System.out.println("The correct answer is " + (one+two));
	}

}
