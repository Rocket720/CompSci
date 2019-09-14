package unit13;

import java.util.Scanner;

import static java.lang.System.out;

public class day4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        out.println("Enter your first 'dim'");
        int x = input.nextInt();
        out.println("Enter your second 'dim'");
        int y = input.nextInt();
        int[][] a = arrayGen(x, y);
        a = rowColSum(a);

    }
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
    }
    public static int[][] arrayGen(int x, int y){
        int[][] a = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = (int)(Math.random()*10);
            }
        }
        return a;
    }
    public static int[][] rowColSum(int[][] a){
        for (int i = 0; i < a.length; i++) {
           int sum = 0;
           sum+=0;


        }
        return a;
    }

}
