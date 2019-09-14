package unit1;

import java.util.Scanner;

public class day1_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        for (int i = 0; i < val; i++) {
            if (i%2==1)
                System.out.print(i + " ");
        }

    }

}
