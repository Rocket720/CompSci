import java.text.DecimalFormat;
import java.util.Scanner;

public class day5_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much is the item?");
		double price = input.nextDouble();
		
		System.out.println("How much money you got?");
		double money = input.nextDouble();
		
		int items = (int) (money/price);
		double change = money%price;
		DecimalFormat df = new DecimalFormat(".##");
		
		
		System.out.println("You can buy " + items + " with $" + df.format(change) + " left.");
		
	}

}
