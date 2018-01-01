package unit7;

import java.util.Scanner;

public class day1_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int a1 = Math.min(a, b);
        int b1 = Math.max(a, b);
        int c = a1;
        while (a1 < (b1)) {
            a1++;
            c = c + a1;
        }
        System.out.println("The integers from " + a + " to " + b + " sum to " + c);
    }

}
