package unit5;

import java.util.Scanner;

public class day5_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int in = input.nextInt();
        double val = Math.sqrt(in);

        int valN = (int) Math.pow(((int) val), 2);
        int valP = (int) Math.pow((valN+1), 2);

        if(in==valN){
            System.out.println(in + " is a perfect square");
        }
        else if(in<0){
            System.out.println("The perfect square closer to " + in + " is 0");
        }
        else if((in-valN)<(valP-in)){
            System.out.println("The perfect square closer to " + in + " is " + valN);
        }
        else if((in-valN)>(valP-in)){
            System.out.println("The perfect square closer to " + in + " is " + valP);
        }




    }

}
