package unit5;

import java.util.Scanner;

public class day4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade");
        int grade = input.nextInt();

        switch(grade){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("You are in elementary school");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("You are in middle school");
                break;
            case 9 :
            case 10 :
            case 11 :
            case 12 :
                System.out.println("You are in high school");
                break;
            case 13 :
            case 14 :
            case 15 :
            case 16 :
                System.out.println("You are in college");
                break;
        }
    }

}
