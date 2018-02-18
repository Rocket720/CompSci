package unit8;

import java.util.Scanner;

public class day1_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print((int)(Math.random()*7)+1 + " ");
        }

    }

}
