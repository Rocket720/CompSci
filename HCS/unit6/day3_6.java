package unit6;

import java.util.Scanner;

public class day3_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        line = line.toLowerCase();

        String lower = line.substring(1, line.length());
        System.out.println((char)((int)line.charAt(0)-32)+""+lower);

    }

}
