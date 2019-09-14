package unit13;

import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=(int)(Math.random()*10);
                total+=a[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(total);
    }

}
