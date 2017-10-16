import java.util.Scanner;

public class day4_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double plus = ((-1*b) + Math.pow((b*b) - (4*a*c) , 0.5)) / (2*a);
		double minus = ((-1*b) - Math.pow((b*b) - (4*a*c) , 0.5)) / (2*a);
		
		System.out.println("The distance between the points is " + plus + ", and " + minus);
	}

}
