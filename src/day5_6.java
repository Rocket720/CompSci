import java.util.Scanner;

public class day5_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How much money you gots?");
		double money = input.nextDouble();		

		int hundred = (int) (money/100);
		double left = money%100;

		int fifty = (int) (left/50);
		left %= 50;	

		int twenty = (int) (left/20);
		left %= 20;	

		int ten = (int) (left/10);
		left %= 10;

		int five = (int) (left/5);
		left %= 5;

		int one = (int) (left/1);
		left %= 1;

		int quarter = (int) (left/0.25);
		left %= 0.25;

		int dime = (int) (left/0.10);
		left %= 0.10;

		int nickel = (int) (left/0.05);
		left %= 0.05;

		left = left + 0.001; //offset

		int penny = (int) (left/0.01);
		left %= 0.01;	

		if(hundred != 0) {System.out.println(hundred + " hundreds");}
		if(fifty != 0) {System.out.println(fifty + " fifties");}
		if(twenty != 0) {System.out.println(twenty + " twenty");}
		if(ten != 0) {System.out.println(ten + " tens");}
		if(five != 0) {System.out.println(five + " fives");}
		if(one != 0) {System.out.println(one + " ones");}
		if(quarter != 0) {System.out.println(quarter + " quarters");}
		if(dime != 0) {System.out.println(dime + " dimes");}
		if(nickel != 0) {System.out.println(nickel + " nickels");}
		if(penny != 0) {System.out.println(penny + " pennies");}


	}

}
