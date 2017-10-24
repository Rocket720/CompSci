package unit2;
import java.util.Scanner;

public class day5_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);


		System.out.println("Enter the current year:");
		int cYear = input.nextInt();

		System.out.println("Enter your current age:");
		int age = input.nextInt();

		System.out.println("Have you had your birthday yet?");
		String yesno = scan.nextLine();

		if(yesno.equals("yes")){
			age++;	
			System.out.println("Happy Belated Birthday!");
		}
		else if(yesno.equals("no")) {
			System.out.println("Happy Early Birthday!");
		}

		System.out.println(cYear - age);
	}

}
