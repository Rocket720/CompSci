package unit4;

import java.util.Scanner;

public class day1_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		double four = input.nextDouble();

		if(((one+two+three+four)/4)>65) {
			System.out.println("Your average is " + (one+two+three+four)/4);
			System.out.println("Congrats you lived");
		}
		else if(((one+two+three+four)/4)<65) {
			System.out.println("Your average is " + (one+two+three+four)/4);
			System.out.println("You are soooooo dead");			
		}
	}

}
