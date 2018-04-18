package unit12;

import java.util.Scanner;

public class day1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        System.out.println(thirdAngle(d1, d2));

    }
    public static double thirdAngle(double d1,double d2){
        return (180-d1-d2);
    }

}
