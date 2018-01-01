package unit6;

import java.util.Scanner;

public class day7_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        String l2 = word.substring(word.length()-2, word.length());
        word = l2.concat(word.substring(0, word.length()-2));
        System.out.println(word);


    }

}
