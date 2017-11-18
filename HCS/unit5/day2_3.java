package unit5;

import java.util.Scanner;

public class day2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Try your luck");
        System.out.println("Enter a number");
        double val = input.nextDouble();

        int mNum =(int) (Math.random()*90) + 10;

        if(val!=(int)(val)^val<10^val>100){
            System.out.println("Invalid Entry");
        }
        else {
            if (val == mNum) {
                System.out.println("The number was " + mNum);
                System.out.println("Holy fork, you win 10,000");
            } else if (val >= mNum - 5 && val <= mNum + 5) {
                System.out.println("The number was " + mNum);
                System.out.println("Congrats, you win 3,000");
            } else if (val >= mNum - 10 && val <= mNum + 10) {
                System.out.println("The number was " + mNum);
                System.out.println("Nice, you win 1,000");
            } else {
                System.out.println("You lose idiot");
                System.out.println("The number was " + mNum);
            }
        }
    }
}
