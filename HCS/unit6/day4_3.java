package unit6;

import java.util.Scanner;

public class day4_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        String cut = input.nextLine();
        String line = input.nextLine();

        int x = 0;
        if (false==(line.contains("a")||line.contains("A")||line.contains("e")||line.contains("E")||line.contains("i")||line.contains("I")||line.contains("o")||line.contains("O")||line.contains("u")||line.contains("U"))) {
            System.out.println("'" + line + "' does not contain the word " + "'" + word + "'");
        }
        else{
            if (line.contains("a")||line.contains("A")){
                x++;
            }
            if (line.contains("e")||line.contains("E")){
                x++;
            }
            if (line.contains("i")||line.contains("I")){
                x++;
            }
            if (line.contains("o")||line.contains("O")){
                x++;
            }
            if (line.contains("u")||line.contains("U")){
                x++;
            }
            System.out.println("'" + line + "' has " + x + " unique vowels");

        }

    }

}
