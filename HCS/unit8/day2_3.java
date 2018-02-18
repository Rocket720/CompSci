package unit8;

import java.util.Scanner;

public class day2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt()+2;
        for (int i = 0; i < x; i++) {

            for (int j = 1; j < i; j++) {

                System.out.print(j+" ");

            }
            System.out.println();
        }

    }
}
