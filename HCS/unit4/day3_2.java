package unit4;

import java.util.Scanner;

public class day3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the Number!");
        System.out.println("Hard or Easy mode?");

        String diff = input.nextLine();
        int num;

        if (diff.equals("hard")||diff.equals("Hard")){
            System.out.println("Enter a number");
            int val = input.nextInt();

            num = (int) (Math.random()*101);

            boolean done = false;
            int i = 0;
            while (done == false|| i != 3) {
                if (num == val) {
                    done = true;
                    System.out.println("Correct");
                } else if (num != val) {
                    if(val>num){
                        System.out.println("Too high");
                    }
                    else if(val<num){
                        System.out.println("Too low");
                    }
                    System.out.println("Try again");
                    done = false;
                }
                val = input.nextInt();
                i++;
            }
        }
        else if(diff.equals("easy")||diff.equals("Easy")){
            System.out.println("Enter a number");
            int val = input.nextInt();

            num = (int) (Math.random()*11);

            boolean done = false;
            int i = 0;
            while (done == false|| i != 3) {
                if (num == val) {
                    done = true;
                    System.out.println("Correct");
                } else if (num != val) {
                    if(val>num){
                        System.out.println("Too high");
                    }
                    else if(val<num){
                        System.out.println("Too low");
                    }
                    System.out.println("Try again");
                    done = false;
                }
                val = input.nextInt();
                i++;
            }
        }
    }
}
