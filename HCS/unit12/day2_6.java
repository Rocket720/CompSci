package unit12;

import java.util.Scanner;

public class day2_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many");
        int num = input.nextInt();
        int[] a = rollDice(num);
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] rollDice(int num){
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = (int)(Math.random()*6);
        }
        return a;
    }

}
