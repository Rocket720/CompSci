package unit3;

import java.util.Scanner;

public class UnitTest3_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Press 0 and enter when you want to start");
		String pause = input.next();
		double first = System.currentTimeMillis();
		
		System.out.println("Press 0 and enter when you want to stop");
		String pause2 = input.next();
		double second = System.currentTimeMillis();
		
		double dif = ((second - first)/1000);
		
		System.out.println("Your time was " + dif + " seconds");
		
		
	}

}
