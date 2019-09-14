package unit12;

import java.util.Scanner;

public class day3_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }
        int pos = input.nextInt();
        System.out.println(arrayPos(pos, a));

    }
    public static int arrayPos(int pos, int... a){
        return a[pos];
    }

}
