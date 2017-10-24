package unit3;

import java.util.Scanner;

public class day3_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 positive integers");
		int one = input.nextInt();
		int two = input.nextInt();
		
		int min = (int) (Math.min(one, two));
		int max = (int) (Math.max(one, two));
		
		int rand = (int) ((Math.random()*(max-min+1))+min);
		
		System.out.println("The random integer on the interval [" + min + ", " + max + "] is " + rand );
	}

}
