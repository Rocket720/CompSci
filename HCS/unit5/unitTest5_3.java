package unit5;

import java.util.Scanner;

public class unitTest5_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer 1-100");
        double val = input.nextDouble();

        boolean three = val%3==0;
        boolean five = val%5==0;
        boolean inv = val>100||val<1||val!=(int)val;

        if(inv){
            System.out.println("Invalid entry");
        }
        else if(three&&five){
            System.out.println("3 and 5 are both factors");
        }
        else if(three){
            System.out.println("3 is a factor, 5 is not");
        }
        else if(five) {
            System.out.println("5 is a factor, 3 is not");
        }
        else{
            System.out.println("Neither 3 nor 5 are factors");
        }
    }

}
