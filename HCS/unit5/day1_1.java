package unit5;

import java.util.Scanner;

public class day1_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random()*10);
        int num2 = (10-num1);

        System.out.println("Evaluate " + num1 + " + " + num2);

        int val = input.nextInt();

        boolean valid = (num1+num2)==val;

        System.out.println(num1 + " + " + num2 + " =  " + (num1+num2) + " " + valid);
    }

}
