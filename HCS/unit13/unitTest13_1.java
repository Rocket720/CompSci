package unit13;

import java.util.Scanner;

import static java.lang.System.out;

public class unitTest13_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        out.println("How many rows");
        int x = input.nextInt();
        out.println("How many columns");
        int y = input.nextInt();
        char[][] a = new char[x][y];
        a = xoFill(a);
        printArray(a);
    }

    public static char[][] xoFill(char[][] a) {
        int val = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (val%2==0){
                    a[i][j] = 'x';
                }
                else if (val%2==1){
                    a[i][j] = 'o';
                }
                val++;
            }
            val++;
        }
        return a;
    }

    public static void printArray(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
    }

}
