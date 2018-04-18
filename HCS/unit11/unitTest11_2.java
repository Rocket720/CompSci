package unit11;

import java.util.Scanner;

public class unitTest11_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String line = input.nextLine();
        char[] a = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            a[i] = line.charAt(i);
        }
        System.out.println("Enter a letter");
        String letter = input.next();
        char let = letter.charAt(0);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (a[i]==let){
                count++;
            }
        }
        System.out.println("There are " + count + " " + let + "'s");

        int pos = 0;
        for (int i = 0; i < line.length(); i++) {
            if (a[i]==let){
                pos = i;
                break;
            }
        }
        System.out.println("The first " + let + " is at position " + pos);
    }

}
