package unit6;

import java.util.Scanner;

public class day7_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();

        char min = (char)(Math.min((int)word.charAt(0), Math.min((int)word.charAt(1), Math.min((int)word.charAt(2), (int)word.charAt(3)))));
        char max = (char)(Math.max((int)word.charAt(0), Math.max((int)word.charAt(1), Math.max((int)word.charAt(2), (int)word.charAt(3)))));

        System.out.println("The word '"+word+"' contains letters from "+min+" to "+max);
    }

}
