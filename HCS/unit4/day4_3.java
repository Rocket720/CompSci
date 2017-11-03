package unit4;

import java.util.Scanner;

public class day4_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter slope and intercept of line 1");
        double s1 = input.nextDouble();
        double i1 = input.nextDouble();

        System.out.println("Enter slope and intercept of line 2");
        double s2 = input.nextDouble();
        double i2 = input.nextDouble();

        if(s1==s2&&i1==i2){
            System.out.println("Infinite solutions");
        }
        else if(s1==s2&&i1!=i2){
            System.out.println("No solutions");
        }
        else{
            System.out.println("The solution is ( " + ((i2-i1)/(s1-s2)) + ", " + (((s2*i1)-(s1*i2))/(s2-s1)) + ")");
        }
    }

}
