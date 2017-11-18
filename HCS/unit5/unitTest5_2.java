package unit5;

import java.util.Scanner;

public class unitTest5_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer 0-11");
        int val = input.nextInt();
        int num = (int) (Math.random()*12);

        if(val==num){
            System.out.println("Correct, you win $100");
        }
        else if((val-1)==num^(val+1)==num){
            System.out.println("The correct number was " + num + ", you win $25");
        }
        else if(val%2==num%2){
            System.out.println("The correct number was " + num + ", you win $2");
        }
        else{
            System.out.println("The correct number was " + num + ", you lose");
        }




    }

}
