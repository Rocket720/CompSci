package unit12;

import java.util.Scanner;

public class unitTest12_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String line = input.nextLine();
        reverseSentence(line);
    }
    public static void reverseSentence(String line){
        char[] a = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            a[i] = line.charAt(line.length()-1-i);
        }
        printV(a);
    }
    public static void printV(char[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
