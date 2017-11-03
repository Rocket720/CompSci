package unit4;

import java.util.Scanner;

public class unitTest4_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Guess the integer on 0-6");
        int g = input.nextInt();
        int num = (int) (Math.random()*7);

        if(g==num){
            System.out.println("You won");
        }
        else{
            System.out.println("Try again");
            g = input.nextInt();
            if(g==num){
                System.out.println("You win");
            }
            else{
                System.out.println("You lose");
                System.out.println("Correct answer was " + num);
            }
        }




    }

}
