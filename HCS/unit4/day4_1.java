package unit4;

import java.util.Scanner;

public class day4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        double val = input.nextDouble();

        if(val==(int)val) {
            if ((val % 2) == 0) {
                System.out.println(val + " is even");
            } else if ((val % 2) != 0) {
                System.out.println(val + " is odd");
            }
        }
        else{
            System.out.println("Invalid Entry");
        }
    }

}
