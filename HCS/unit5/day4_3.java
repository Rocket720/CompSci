package unit5;

import java.util.Scanner;

public class day4_3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 angles of a triangle.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = 180 - a -b;

        int x = 0;

        if (a==90||a==90||c==90)
            x = 0;
        else if (a>90||b>90||c>90)
            x=1;
        else
            x=2;

        switch (x){
            case 0:System.out.println("Right Triangle");

                break;

            case 1: System.out.println("Obtuse Triangle");

                break;

            default:System.out.println("Acute Triangle");

        }
    }
}