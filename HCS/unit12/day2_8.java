package unit12;

import java.util.Scanner;

public class day2_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("2 integers");
        int num = input.nextInt();
        int num2 = input.nextInt();
        int mid = num;

    }
    public static int rollDice(int num){
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = (int)(Math.random()*6)+1;
        }
        return a[0];
    }

}
