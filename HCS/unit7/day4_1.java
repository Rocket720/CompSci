package unit7;

import java.util.Scanner;

public class day4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char one = word.charAt(0);
        char two = word.charAt(2);
        char a = (char)(Math.min((int)one, (int)two));
        char b = (char)(Math.max((int)one, (int)two));
        System.out.println("The letter between " + a + " and " + b + " are ");
        for (int i = (int)a+1; i < (int)b; i++) {
            System.out.print((char)i);
        }
    }
}
