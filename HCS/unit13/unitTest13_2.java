package unit13;

import java.util.Scanner;

import static java.lang.System.out;

public class unitTest13_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        out.println("How large?");
        int x = input.nextInt();
        int[][] a = new int[x][x];
        a = edgeFill(a);
        printArray(a);
    }

    public static int[][] edgeFill(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[0][i] = 1;
            a[a.length-1][i] = 1;
            a[i][0] = 1;
            a[i][a.length-1] = 1;
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
