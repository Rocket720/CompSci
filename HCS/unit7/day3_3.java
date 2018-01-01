package unit7;

import java.util.Scanner;

public class day3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int a1 = Math.min(a, b);
        int b1 = Math.max(a, b);
        int c = 0;
        int d = 0;
        for (int i = a1; i < b1+1; i++) {
            System.out.println(i);
            if ((i%2)==0){
                c++;
                if ((i%3)==0){
                    d++;
                }
            }
        }
        System.out.println("Of the " + c + " even numbers, " + d + " are divisible by 3");

    }
}

