package unit12;

import java.util.Scanner;

public class day3_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int mid = val2;
        val2 = Math.max(val1, val2);
        val1 = Math.min(val1, val2);
        int[] a = randArray(num, val1, val2);
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] randArray (int number, int low, int hi){
        int[] a = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = (int)(Math.random()*(hi-low))+low;
        }
        return a;
    }
}
