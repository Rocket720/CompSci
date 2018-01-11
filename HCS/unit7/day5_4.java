package unit7;

import java.util.Scanner;

public class day5_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = 0;
        int val2 = 0;
        for (int i = input.nextInt(); i > 0; i--) {
            System.out.println("Enter value #" + i);
            val = input.nextInt();
            if (val>val2){
                val2 = val;
            }
        }
        System.out.println("Highest number was " + val2);
    }
}

