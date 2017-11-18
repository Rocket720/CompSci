package unit5;

import java.util.Scanner;

public class day1_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value");
        double val = input.nextDouble();

        if(val%3==0&&val%4==0){
            System.out.println(val + " is a multiple of 3 and 4");
        }
        else if (val%3==0^val%4==0){
            if(val%3==0){
                System.out.println(val + " is a multiple of 3 but not 4");
            }
            else if(val%4==0){
                System.out.println(val + "is a multiple of 4 but not 3");
            }
        }

    }

}
