package unit5;

import java.util.Scanner;

public class unitTest5_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many dice would you like to roll?");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println((int) (Math.random()*7));
                break;
            case 2:
                System.out.println((int) (Math.random()*7));
                System.out.println((int) (Math.random()*7));
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }

}
