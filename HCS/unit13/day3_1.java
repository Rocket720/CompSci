package unit13;

import java.util.Scanner;

public class day3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] a = squareMat(num);
        printArray(a);
        System.out.println();
        sumColDiag(a);
    }
    public static int[][] squareMat(int num){
        int[][] a = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                a[i][j]=(int)(Math.random()*10);
            }
        }
        return a;
    }
    public static void sumColDiag(int[][] a){
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for (int j = 0; j < a.length; j++) {
                total+=a[j][i];
            }
            b[i][i] = total;
        }
        printArray(b);
    }
    public static void printArray(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}