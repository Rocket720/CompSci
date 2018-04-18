package unit10;

import java.util.Scanner;

public class day1_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] a = new int[num];
        int total = 0;
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 2; i < num+1; i++) {
            for (int j = 0; j < i; j++) {
                total+=a[j];
            }
            System.out.print(total + " ");
            total = 0;
        }
    }

}
