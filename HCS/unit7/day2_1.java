package unit7;

import java.util.Scanner;

public class day2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int a1 = Math.min(a, b);
        int b1 = Math.max(a, b);
        int c = 2*(a1/2);
        System.out.println("The even numbers between " + a1 + " and " + b1 + " are:");
        while (c < b1-2) {
            c=c+2;
            System.out.print(c + ", ");
        }
    }
}
