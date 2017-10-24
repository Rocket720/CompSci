package unit3;

import java.util.Scanner;

public class day2_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int one = (int) (Math.random()*101);
		int two =(int) (Math.random()*101);
		
		System.out.println(Math.max(one, two) + " - " + Math.min(one, two));
		
		String pause = input.next();
		
		System.out.println("The correct answer was " + (Math.max(one, two) - Math.min(one, two)));
	}

}
