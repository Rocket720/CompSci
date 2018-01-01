package unit7;

import java.util.Scanner;

public class day4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = Math.min(a, b);
        int d = Math.max(a, b);
        int e = 0;
        System.out.println("The sum of the odd numbers between " + c + " and " + d + " is ");
        for (int i = c-2; i < d; i++) {
            if (i%2!=0){
                e = e+i;
            }
        }
        System.out.println(e);
    }
}
