package unit12;

import java.util.Scanner;

public class day1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        System.out.println(divide(d1, d2));

    }
    public static double divide(double d1,double d2){
        return(d1/d2);
    }

}
