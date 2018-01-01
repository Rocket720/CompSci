package unit7;

import java.util.Scanner;

public class day3_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();

        for (int i = 0; i < word.length(); i++) {

            char x = (char)((int)(word.charAt(i))+1);
            if ((word.charAt(i))=='z'||(word.charAt(i))=='Z'){
                x = (char)((int)(word.charAt(i))-25);
            }
            System.out.print(x);

        }

    }
}

