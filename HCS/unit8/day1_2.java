package unit8;

import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int max = input.nextInt();
        int count = 0;
        do {
            count = count + i;
            i++;
        }
        while(i<max);
        System.out.println("The sum is " + count);

    }

}
