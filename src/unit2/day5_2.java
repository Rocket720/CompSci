import java.util.Scanner;

public class day5_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int original = input.nextInt();
		int in = (int) Math.pow(original, 0.5);

		int below = (int) Math.pow(in, 2);
		int above = (int) Math.pow((in + 1), 2);

		System.out.println("The perfect squares above and below " + in + " are " + below + " and " + above + ".");
	}

}
