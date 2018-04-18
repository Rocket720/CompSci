package unit10;

import java.util.Scanner;

public class day1_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] posUp = new char[line.length()];
        for (int i = 1; i < line.length(); i++) {
            posUp[i-1] = line.charAt(i);
        }
        posUp[line.length()-1] = line.charAt(0);
        for (int i = 0; i < line.length(); i++) {
            System.out.print(posUp[i]);
        }
    }

}
