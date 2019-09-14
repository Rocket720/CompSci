package unit13;

import java.util.Scanner;

public class day2_2 {
    public static int x = 4;
    public static int y = 5;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a x dimension");
        x = input.nextInt();
        System.out.println("Enter a y dimension");
        y = input.nextInt();

        int[][] a = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j]=(int)(Math.random()*10)+90;
            }
        }
        printMatrix(a);

        System.out.println("1 for change 2 for no change");
        int choice = input.nextInt();
        if (choice==1){
            System.out.println("Enter you x and y dims for the first position");
            int rx1 = (input.nextInt()); int ry1 = (input.nextInt());
            System.out.println("Enter you x and y dims for the second position");
            int rx2 = (input.nextInt()); int ry2 = (input.nextInt());
            a = swapArray(rx1, ry1, rx2, ry2, a);
        }
        else{
            System.out.println("Fine be that way");
        }

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
    public static int[][] swapArray(int rx1, int ry1, int rx2, int ry2, int[][] a){
        int mid = a[rx1][ry1];
        a[rx1][ry1] = a[rx2][ry2];
        a[rx2][ry2] = mid;
        return a;
    }


}
