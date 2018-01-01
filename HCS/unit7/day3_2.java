package unit7;

import java.util.Scanner;

public class day3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();

        for (int i = (word.length()); i > 0; i--) {
            System.out.print(word.charAt(i-1));
        }
    }
}

