import java.util.Scanner;

public class day4_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double xLeg = x1 - x2;
		double yLeg = y1 - y2;

		double hypo = Math.pow(xLeg, 2) + Math.pow(yLeg, 2);

		System.out.println("The distance between the points is " + Math.pow(hypo, 0.5));
	}

}
