package unit13;

import java.util.Scanner;

public class day2_1 {
    public static int x = 4;
    public static int y = 5;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] a = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j]=j+(i*5)+1;
            }
        }
        printMatrix(a);

        int rx1 = (int)(Math.random()*x); int ry1 = (int)(Math.random()*y);
        int rx2 = (int)(Math.random()*x); int ry2 = (int)(Math.random()*y);
        int mid = a[rx1][ry1];
        a[rx1][ry1] = a[rx2][ry2];
        a[rx2][ry2] = mid;

        System.out.println();
        printMatrix(a);

    }
    public static void printMatrix(int [][] a){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}
