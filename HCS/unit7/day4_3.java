package unit7;

import java.util.Scanner;

public class day4_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String let = input.next();
        char tar = let.charAt(0);

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (tar==line.charAt(i)){
                count++;
            }
        }
        System.out.println("There are " + count + " " + let + "'s in '" + line + "' ");

    }

}
