package unit7;

import java.util.Scanner;

public class day8_PP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ping Pong score counter");

        System.out.println("Enter Player 1's Name");
        String p1 = input.next();

        System.out.println("Enter Player 2's Name");
        String p2 = input.next();

        System.out.println("Who is serving first?");
        System.out.println("Enter the name or enter random");
        String f = input.next();
        String fServe = f.toLowerCase();
        boolean won = false;
        int ws = 0;
        int ls = 0;
        int count = 0;
        boolean swap = true;
        String s1 = "";
        String s2 = "";

        //score vars
        int ps1 = 0;
        int ps2 = 0;
        String winner = "";

        //player 1 serves
        if (fServe.equals(p1.toLowerCase())) {
            s1 = p1;
            s2 = p2;
            System.out.println(p1 + " serves first");
        }
        //player 2 serves
        else if (fServe.equals(p2.toLowerCase())) {
            s1 = p2;
            s2 = p1;
            System.out.println(p2 + " serves first");
        }
        //random player serves
        else if (fServe.equals("random") || fServe.equals("rand") || fServe.equals("Random") || fServe.equals("Rand")) {
            double rand = Math.random();
            if (rand > 0.5) {
                System.out.println(p1 + " serves first");
                s1 = p1;
                s2 = p2;
            } else if (rand < 0.5) {
                System.out.println(p2 + " serves first");
                s1 = p2;
                s2 = p1;
            }
        }
        //else for first serve picker
        else{
            System.out.println("Wtf");
        }

        System.out.println("Score:");
        System.out.println(p1 + ": 0");
        System.out.println(p2 + ": 0");

        while (!won) {
            System.out.println();
            System.out.println("Who won? Enter a name or player #");
            winner = input.next();
            winner = winner.toLowerCase();

            //chosing winner
            if (winner.equals(p1.toLowerCase())||winner.equals("1")) {
                ps1++;
            }
            else if (winner.equals(p2.toLowerCase())||winner.equals("2")) {
                ps2++;
            }
            else {
                System.out.println("No user with selected name. Try again");
                System.out.println();
            }

            //prints score
            System.out.println("Score:");
            System.out.println(p1 + ": " + ps1);
            System.out.println(p2 + ": " + ps2);

            //win statements
            if ((ps1 >= 21) && (ps1 - 2 >= ps2)) {
                System.out.println(p1 + " is the winner winner chicken dinner with a score of " + ps1 + " to " + ps2);
                won = true;
            }
            else if ((ps2 >= 21) && (ps2 - 2 >= ps1)) {
                System.out.println(p2 + " is the winner winner chicken dinner with a score of " + ps2 + " to " + ps1);
                won = true;
            }
            else if (ps1 == 21) {
                System.out.println(p1 + " is the winner winner chicken dinner with a score of " + ps1 + " to " + ps2);
                won = true;
            }
            else if (ps2 == 21) {
                System.out.println();
                System.out.println(p2 + " is the winner winner chicken dinner with a score of " + ps2 + " to " + ps1);
                won = true;
            }

            //game point
            if (won==false) {
                if (ps1 == 20 ^ ps2 == 20 ^ (ps1 > 21 && ps2 > 21 && ps1 - 1 == ps2) ^ (ps1 > 21 && ps2 > 21 && ps1 - 1 == ps2)) {
                    System.out.println("Game point");
                }


                //server switch
                if (count % 5 == 0 && count != 0) {
                    swap = !swap;

                }
                if (swap == true) {
                    System.out.println(s1 + " serves");
                } else if (swap == false) {
                    System.out.println(s2 + " serves");
                }
            }
            count++;
        }
    }

}
