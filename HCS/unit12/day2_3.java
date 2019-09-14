package unit12;

import java.util.Scanner;

public class day2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        printV(line);

    }
    public static void printV(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }

}
