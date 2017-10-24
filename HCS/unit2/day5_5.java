package unit2;
import java.util.Scanner;

public class day5_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your 1st 3 test grades separated by spaces:");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();

		System.out.println("How many more tests do you have:");
		int tests = input.nextInt();

		System.out.println("What grade are you shooting for:");
		int grade = input.nextInt();

		System.out.println("You need to average " + (((grade*(tests+3))-first-second-third)/tests) + " on the next " + tests + " tests");
	}

}
