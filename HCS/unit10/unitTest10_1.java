package unit10;

import java.util.Scanner;

public class unitTest10_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers you wanna input?");
        int num = input.nextInt();
        System.out.println("Enter them");
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }

        for (int i = num-1; i > -1; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int total = 0;
        for (int i = 0; i < num; i++) {
            total+=a[i];
        }
        System.out.println(total);
    }

}
