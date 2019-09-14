package unit1;

import java.util.Scanner;

import static java.lang.System.out;

public class day1_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cols = input.nextInt(), rows = input.nextInt();
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j]=(int)(Math.random()*10);
            }
        }
        printArray(a);
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
    }

}
