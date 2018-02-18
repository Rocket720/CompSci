package unit8;

import java.util.Scanner;

public class day5_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        for (int i = 0; i < word.length(); i++) {
            int rand = (int)(Math.random()*21);
            for (int j = 0; j < rand; j++) {
                System.out.print(" ");
            }
            System.out.print(word.charAt(i));
            System.out.println();
        }

    }

}
