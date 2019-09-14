package unit13;

import java.util.Scanner;

public class day1_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][4];
        int[][] b = new int[4][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter position [" + i + "] [" + j + "] ");
                a[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

}
