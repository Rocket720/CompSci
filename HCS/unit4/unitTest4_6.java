package unit4;

import java.util.Scanner;

public class unitTest4_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value on the range 50-120");
        double val = input.nextDouble();

        if(val>120){
            System.out.println("Invalid Entry");
        }
        else if(val<50){
            System.out.println("Invalid Entry");
        }
        else if(val!=(int)val){
            System.out.println("Invalid Entry");
        }
        else{
            if((val%2)==0){
                System.out.println(val + " is even");
            }
            else{
                System.out.println(val + " is odd");
            }
        }

    }

}
