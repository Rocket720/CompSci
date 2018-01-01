package unit7;

import java.util.Scanner;

public class day3_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int r = (int)(Math.random()*101);
        int c = 0;
        while(a!=r) {
            c++;
            a = input.nextInt();
            if (a<r){
                System.out.println("Too low");
            }
            else if(a>r){
                System.out.println("Too high");
            }
            else if (a==r){
                System.out.println("You are cheating");
                break;
            }
        }
        System.out.println("The number was " + r + ", you got it in " + c + " tries");


    }

}
