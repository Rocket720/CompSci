package unit5;

import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer");

        double val = input.nextDouble();

        if(val!=(int)val){
            System.out.println("no bad");
        }
        else{
            boolean even = val%2==0;
            if(even){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }

        }


    }

}
