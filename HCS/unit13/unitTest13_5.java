package unit13;


import java.util.Scanner;

import static java.lang.System.out;

public class unitTest13_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.println("How many rows");
        int x = input.nextInt();
        out.println("How many columns");
        int y = input.nextInt();
        int[][] a = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Enter position (" + i + ", " + j + ")");
                a[i][j] = input.nextInt();
            }
        }
        a = sumCol(a);
        printArray(a);
    }

    public static int[][] sumCol(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (char)((int)(Math.random()*26+97)) ;
            }
        }
        return a;
    }

    public static int[][] arkIn(int[][] a) {
        String ark = "ARKANSAS";
        int x = (int)(Math.random()*12);
        int y = (int)(Math.random()*(12-8));
        int val = 0;
        for (int i = y; i < y+8; i++) {
            a[x][i] = ark.charAt(val);
            val++;
        }

        return a;
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
