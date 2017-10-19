package unit2;
import java.util.Scanner;

public class day6_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the line's slope:");
		double slope = input.nextDouble();

		System.out.println("Enter the line's y-intercept:");
		double intercept = input.nextDouble();

		System.out.println("Enter your x value:");
		double x = input.nextDouble();

		System.out.println("The cooresponding y-value is " + ((slope*x)+intercept));

	}

}