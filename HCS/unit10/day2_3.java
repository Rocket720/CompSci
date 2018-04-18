package unit10;

import java.util.Scanner;

public class day2_3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String low = line.toLowerCase();
        char[] a = new char[line.length()];//normal
        char[] b = new char[line.length()];//no space
        char[] c = new char[line.length()];//backwards

        //setter
        for (int i = 0; i < a.length; i++) {
            a[i] = low.charAt(i);
        }

        //deleting spaces
        for (int i = 0; i < a.length; i++) {
            if (a[i]==' '){
                continue;
            }
            b[i] = a[i];
        }

        //reversing
        int d = b.length-1;
        for (int i = 0; i < b.length-1; i++) {
            c[i] = b[d];
            d--;
        }

        //comparing all chars
        int count = 0;
        for (int i = 0; i < c.length-1; i++) {
            if (c[i]!=b[i]){
                count++;
                System.out.println("*" + c[i] + "*" + " here at " + i);
            }
        }
        if (count==0){
            System.out.println(line + " is a palindrome");
        }
        else if (count>0){
            System.out.println(line + " is not a palindrome");
        }
    }

}
