package unit12;

import java.util.Scanner;

public class day2_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int med = val1;
        val1 = Math.min(val1, val2);
        val2 = Math.max(med, val2);
        System.out.println(randBet(val1, val2));

    }
    public static int randBet(int val1, int val2){
        return ((int)(Math.random()*(val2-val1))+val1);
    }

}
