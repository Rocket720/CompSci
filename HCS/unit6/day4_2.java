package unit6;

import java.util.Scanner;

public class day4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        String cut = input.nextLine();
        String line = input.nextLine();

        String lineUp = line.toUpperCase();
        if (line.contains(word)||lineUp.contains(word.toUpperCase())) {
            System.out.println("'" + line + "' contains the word " + "'" + word + "'");
        }
        else {
            System.out.println("'" + line + "' does not contain the word " + "'" + word + "'");
        }

    }

}
