
package unit3;

import java.util.Scanner;

public class UnitTest3_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int f1 = (int) (Math.random()*5);
		int f2 = (int) (Math.random()*5);
		int f3 = (int) (Math.random()*5);
		int ff = (f1*100)+(f2*10)+f3;
		
		int s1 = (int) (Math.random()*6);
		int s2 = (int) (Math.random()*6);
		int s3 = (int) (Math.random()*6);
		int sf = (s1*100)+(s2*10)+s3;
		
		System.out.println("Convert " + ff + " in base 5 to base 6");
		
		String pause = input.next();
		
		int dec = (f1*25) + (f2*5) + (f3*1);
		int six1 = dec/100;
		int six2 = (dec%100)/10;
		int six3 = ((dec%100)%10);
		int conv = (six1*100)+(six2*10)+(six3);
		System.out.println("The correct answer is " + conv);
	}

}
