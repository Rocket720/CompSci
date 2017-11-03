package unit4;

import java.util.Scanner;

public class day4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter slope and intercept");

        double slope = input.nextDouble();
        double inter = input.nextDouble();

        System.out.println("Enter x and y values");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(y==((slope*x)+inter)){
            System.out.println("( " + x + ", " + y + ") is on the line");
        }
        else{
            System.out.println("( " + x + ", " + y + ") is not on the line. " + "( " + x + ", " + ((slope*x)+inter) + ") is.");
        }

    }

}
