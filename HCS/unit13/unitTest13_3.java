package unit13;

import java.util.Scanner;

import static java.lang.System.out;

public class unitTest13_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        out.println("How many rows");
        int x = input.nextInt();
        out.println("How many columns");
        int y = input.nextInt();
        int[][] a = new int[x][y];
        a = snakeFill(a);
        printArray(a);
    }

    public static int[][] snakeFill(int[][] a) {
        int val = 1;
        for (int i = 0; i < a.length; i++) {
            if (i%2==0){
                for (int j = 0; j < a[0].length-1; j++) {
                    a[i][j] = val;
                    val++;
                }
            }
            else if(i%2==1){
                for (int j = a[0].length-1; j > 0; j--) {
                    a[i][j] = val;
                    val++;
                }
            }

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
