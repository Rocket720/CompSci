package unit12;

import java.util.Scanner;

public class day4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] a = new String[num];
        String[] b = new String[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.next();
            b[i] = input.next();
        }
        int choice = input.nextInt();
        //nameSort(choice, a, b);
        for (int i = 0; i < num; i++) {

        }

    }
    public static int nameSort(int pos, int... a){
        return a[pos];
    }

}
