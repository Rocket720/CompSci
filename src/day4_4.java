import java.util.Scanner;

public class day4_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your initial investment:");
		double init = input.nextDouble();
		
		System.out.println("Enter your interest rate:");
		double rate = input.nextDouble();
		
		System.out.println("Enter your investment time in years:");
		double time = input.nextDouble();
	
		double investment = init*Math.pow((1 + (rate / 100)), time);
		
		System.out.println("In " + time + " years, the investment will be worth $" + investment);
	}

}
