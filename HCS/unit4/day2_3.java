package unit4;

import java.util.Scanner;

public class day2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like 1-digit or 2-digit addition?");
        String choice = input.nextLine();

        if(choice.equals("2")||choice.equals("2-digit")||choice.equals("2-Digit")){
            int one = (int) (Math.random()*11);
            int two = (int) (Math.random()*11);

            System.out.println(one + " + " + two);

            int val = input.nextInt();

            if(val==(one+two)){
                System.out.println("Correct");
            }
            else if(val!=(one+two)){
                System.out.println("Wrong");
            }
            else{
                System.out.println("Invalid Entry");
            }

        }
        else if(choice.equals("1")||choice.equals("1-digit")||choice.equals("1-Digit")){
            int oneTen = (int) (Math.random()*101);
            int twoTen = (int) (Math.random()*101);

            System.out.println(oneTen + " + " + twoTen);

            int val = input.nextInt();

            if(val==(oneTen+twoTen)){
                System.out.println("Correct");
            }
            else if(val!=(oneTen+twoTen)){
                System.out.println("Wrong");
            }
            else{
                System.out.println("Invalid Entry");
            }

        }

    }

}
