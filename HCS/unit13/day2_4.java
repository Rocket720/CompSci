package unit13;

import java.util.Scanner;

public class day2_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a dimension");
        int dim = input.nextInt();

        int[][] a = arrayGen(dim, dim);
        printArray(a);
        System.out.println();

        System.out.println("The sum of the major diagonal is " + diagSum(a));
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

    public static void printArray(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int diagSum(int[][] a){
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total+=a[i][i];
        }
        return total;
    }

}
