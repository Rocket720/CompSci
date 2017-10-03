import java.util.Scanner;

public class unit2Test_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter a 3-digit number in base 6:");
		int six = input.nextInt();
		
		int a1 = six/100;
		int a2 = six%100;
		int dec1 = a1 * 36;
		
		int b1 = a2/10;
		int b2 = a2%10;
		int dec2 = b1 * 6;
		
		int dec3 = b2;
		
		int dec = dec1 + dec2 + dec3;
		
		if(dec > 64) {
			int eight1 = 
		}
		System.out.println(six + " in base 6 is equal to " + "eight" + " in base 8");
		
	}

}
