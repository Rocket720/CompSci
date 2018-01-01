package unit7;

import java.util.Scanner;

public class day2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int a1 = Math.min(a, b);
        int b1 = Math.max(a, b);
        int c = 0;
        for (int i = a1; i < b1; i++) {
            if((i%6)==0){
                c++;
            }
        }
        System.out.println("There are " + c + " multiples of 6 in between " + a1 + " and " + b1);
    }
}
