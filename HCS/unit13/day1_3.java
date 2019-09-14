package unit13;

import java.util.Scanner;

public class day1_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][6];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Enter position [" + i + "] [" + j + "] ");
                a[i][j]=input.nextInt();
            }
        }
        int total = 0;
        int prev = 0;
        for (int i = 0; i < 6; i++) {
            total = a[0][i] + a[1][i];
            if (total>prev){
                prev = total;
            }
        }
        System.out.println("The greatest column sum is " + total);
    }

}
