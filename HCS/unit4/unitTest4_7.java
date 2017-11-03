package unit4;

import java.util.Scanner;

public class unitTest4_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 points");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();

        double slope1 = (y2-y1)/(x2-x1);
        double slope2 = (y3-y2)/(x3-x2);

        double inter1 = y1 - (slope1*x1);
        double inter2 = y2 - (slope2*x2);

        double m1 = slope1;
        double m2 = slope2;
        double b1 = inter1;
        double b2 = inter1;

        /*double check =

        if(){

        }

*/

    }

}
