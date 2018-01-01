package unit6;

import java.util.Scanner;

public class day3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String m = "m";

        line = m.concat(line.substring(1, line.length()));
        System.out.println(line);

    }

}
