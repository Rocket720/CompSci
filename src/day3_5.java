import java.util.Scanner;

public class day3_5 {

	public static void main(String[] args){
		while(1 > 0) {
			System.out.println("input the value");
			Scanner in = new Scanner(System.in);
			long number = in.nextLong();

			while (number > 0) {
				System.out.print(number % 10);
				number = number / 10;
			}
			System.out.println();
		}
	}
}
