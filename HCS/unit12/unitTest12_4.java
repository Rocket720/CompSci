package unit12;

import java.util.Scanner;

public class unitTest12_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int val3 = input.nextInt();
        int low = Math.min(val1, Math.min(val2, val3));
        int high = Math.max(val1, Math.max(val2, val3));
        int mid = val1 + val2 + val3 - low - high;
        int dif = bigDiff(low, mid, high);
        printDiff(dif);
    }
    public static int bigDiff(int low, int mid, int high){
        int big = mid - low;
        if ((high-mid)>big){
            big = high-mid;
        }
        return (big);
    }
    public static void printDiff(int dif){
        for (int i = 0; i < dif; i++) {
            System.out.print(dif + " ");
        }
    }

}
