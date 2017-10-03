import java.util.Scanner;

public class unit2Test_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length of one leg:");
		double leg1 = input.nextDouble();
		
		System.out.println("Please enter the length of the hypotenuse:");
		double hypo = input.nextDouble();
		
		System.out.println("The length of the other leg is " + Math.pow((Math.pow(hypo, 2)-Math.pow(leg1, 2)), 0.5));
	}

}
