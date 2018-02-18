package unit8;

import java.util.Scanner;

public class day2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print(x + " = ");
        for (int i = 2; i < x; i++) {
            if (x%i==0){
                System.out.print(i+"*");
                x = x/i;
                i = 1;
            }
        }
        System.out.print(x);
    }
}
