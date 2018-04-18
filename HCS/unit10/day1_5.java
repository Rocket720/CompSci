package unit10;

import java.util.Scanner;

public class day1_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] back = new char[line.length()];
        for (int i = line.length(); i > 0; i--) {
            back[i-1] = line.charAt(line.length()-i);
        }
        for (int i = 0; i < line.length(); i++) {
            System.out.print(back[i]);
        }
    }

}
