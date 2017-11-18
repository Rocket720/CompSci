package unit5;

import java.util.Scanner;

public class day3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Rock, Paper, Scissors!");

        System.out.println("Player 1, enter your choice");
        String u1 = input.nextLine();

        System.out.println("Player 2, enter your choice");
        String u2 = input.nextLine();

        if((u1.equals("rock")^u1.equals("Rock"))&&(u2.equals("scissors")^u2.equals("Scissors"))){
            System.out.println("Player 1 wins");
            System.out.println(u1 + " beats " + u2);
        }
        else if((u2.equals("rock")^u2.equals("Rock"))&&(u1.equals("scissors")^u1.equals("Scissors"))){
            System.out.println("Player 2 wins");
            System.out.println(u2 + " beats " + u1);
        }
        else if((u1.equals("scissors")^u1.equals("Scissors"))&&(u2.equals("paper")^u2.equals("Paper"))){
            System.out.println("Player 1 wins");
            System.out.println(u1 + " beats " + u2);
        }
        else if((u2.equals("scissors")^u2.equals("Scissors"))&&(u1.equals("paper")^u1.equals("Paper"))){
            System.out.println("Player 2 wins");
            System.out.println(u2 + " beats " + u1);
        }
        else if((u1.equals("paper")^u1.equals("Paper"))&&(u2.equals("rock")^u2.equals("Rock"))){
            System.out.println("Player 1 wins");
            System.out.println(u1 + " beats " + u2);
        }
        else if((u2.equals("paper")^u2.equals("Paper"))&&(u1.equals("rock")^u1.equals("Rock"))){
            System.out.println("Player 2 wins");
            System.out.println(u2 + " beats " + u1);
        }
        else{
            System.out.println("No one wins");
            System.out.println("Both of you are idiots");
        }
    }

}
