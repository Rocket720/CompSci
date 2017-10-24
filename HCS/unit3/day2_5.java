package unit3;

import java.util.Scanner;

public class day2_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int one = (int) (11*Math.random());
		int two = (int) (Math.random()*((10-one)));

		int oneten = (int) (Math.random()*11);
		int twoten = (int) (Math.random()*((10-oneten)));

		System.out.println(((oneten*10)+one) + " + " +((twoten*10)+two));

		String pause = input.next();

		System.out.println("The correct answer was " + (((oneten*10)+one)+((twoten*10)+two)));

	}

}
