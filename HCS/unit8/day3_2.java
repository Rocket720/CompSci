package unit8;

import java.util.Scanner;

public class day3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int val = in;
        int prime = 0;
        for (int i = val; i > 1; i++) {
            for (int j = val; j > 1; j++) {
                if (i%j==0){
                    prime++;
                }
            }
            if(prime==0) {
                System.out.println(i + ", ");

            }
        }

    }

}
