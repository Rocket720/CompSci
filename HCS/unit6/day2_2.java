package unit6;

import java.util.Scanner;

public class day2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.next();
        line = line.toUpperCase();
        char a = line.charAt(line.length()-1);

        System.out.println(a);
    }

}
