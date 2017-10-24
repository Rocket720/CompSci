package unit2;
import java.util.Scanner;

public class day4_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double hypo = Math.pow(a, 2) + Math.pow(b, 2);
		
		System.out.println(Math.pow(hypo, 0.5));
		
	}

}
