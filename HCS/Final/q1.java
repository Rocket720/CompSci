package Final;

import java.util.Scanner;

import static java.lang.System.out;

public class q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        char[] a = new char[word.length()];

        int r1 = (int)(Math.random()*word.length());
        int r2 = (int)(Math.random()*word.length());

        char first = word.charAt(r1);
        char sec = word.charAt(r2);

        for (int i = 0; i < word.length(); i++) {
            String temp = word.charAt(i) +"";
            if((int)(word.charAt(i))>96){

                temp = temp.toUpperCase();
                a[i] = temp.charAt(0);
            }
            else{
                temp = temp.toLowerCase();
                a[i] = temp.charAt(0);
            }
        }
        a[r1] = sec;
        a[r2] = first;
        printArray(a);
    }

    public static void printArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
                out.print(a[i]);
        }
    }
}
