import java.util.Scanner;

public class unit2Test_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first 2 test grades:");
		double test1 = input.nextDouble();
		double test2 = input.nextDouble();
		
		System.out.println("What grade do you want in the end?");
		double grade = input.nextDouble();
		
		System.out.println("You will need a " + ((3*grade) - test1 - test2) + " on your next test");
		
	}

}
