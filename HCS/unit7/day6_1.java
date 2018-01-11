package unit7;

import java.util.Scanner;

public class day6_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        line = line.toLowerCase();
        String back = "";
        int x = line.length();
        while(back.length()<line.length()){
            back = back + line.charAt(x-1);
            x--;
        }
        if (line.equals(back)){
            System.out.println("Palindrome detected");
        }
        else{
            System.out.println("Nice try");
        }

    }

}
