package unit4;

import java.util.Scanner;

public class day3_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");

        double a = input.nextDouble();
        double b = input.nextDouble();

        b = Math.max(a, b);
        a = Math.min(a, b);

        if((b%a)!=0){
            System.out.println(a + " is not a factor of " + b);
        }
        else {
            System.out.println(a + " is a factor of " + b + " because " + a + " * " + (b/a) + " = " + b);
        }
    }

}
