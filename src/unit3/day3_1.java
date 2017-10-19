package unit3;

import java.util.Scanner;

public class day3_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer");
		int pos = input.nextInt();
		
		System.out.println("Enter an integer greater than " + pos);
		int max = input.nextInt();
		
		int rand = (int) ((Math.random()*(max-pos+1))+pos);
		
		System.out.println("The random integer on the interval [" + pos + ", " + max + "] is " + rand );
	}

}
