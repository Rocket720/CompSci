import java.text.DecimalFormat;
import java.util.Scanner;

public class day6_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the mpg of your ride");
		double mpg = input.nextDouble();

		System.out.println("How expensive is gas rn");
		double price = input.nextDouble();

		System.out.println("How much money you gots");
		int money = input.nextInt();

		double miles = ((money/price)*mpg);
		DecimalFormat df = new DecimalFormat(".##");

		System.out.println("You can travel " + df.format(miles) + " miles");

	}

}
