package unit8;

import java.util.Scanner;

public class day1_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            double j = Math.random();
            if (j<0.5){
                System.out.print("Heads ");
            }
            else if (j>0.5){
                System.out.print("Tails ");
            }
        }
    }
}
