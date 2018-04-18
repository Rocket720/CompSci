package unit12;

import java.util.Scanner;

public class day1_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        double d3 = input.nextDouble();
        System.out.println(average(d1, d2, d3));

    }
    public static double average(double d1,double d2, double d3){
        return ((d1+d2+d3)/3.0);
    }

}
