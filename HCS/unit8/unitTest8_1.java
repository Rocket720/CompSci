package unit8;

import java.util.Scanner;

public class unitTest8_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        System.out.println("How many lines?");
        int lines = input.nextInt();

        for (int i = 0; i < lines+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(word+ " ");
            }
            System.out.println();
        }

    }

}
