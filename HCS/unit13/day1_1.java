package unit13;

import java.util.Scanner;

public class day1_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter position [" + i + "] [" + j + "] ");
                a[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
