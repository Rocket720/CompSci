package unit13;

import java.util.Scanner;

public class day1_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter position [" + i + "] [" + j + "] ");
                a[i][j]=input.nextInt();
            }
        }

        printMatrix(a);
    }
    public static void printMatrix(int [][] a){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}
