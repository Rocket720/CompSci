package unit3;

import java.util.Scanner;

public class day3_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int oneten = (int) (Math.random()*11);

		int one = (int) (11*Math.random());
		int two = (int) ((Math.random()*(10-one))+one);

		

		System.out.println(((oneten*10)+one) + " + " +two);

		String pause = input.next();

		System.out.println("The correct answer was " + ((oneten*10)+one) + " + " +two);

	}

}
