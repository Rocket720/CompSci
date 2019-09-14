package unit12;

import java.util.Scanner;

public class day2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        caseSwap(line);

    }
    public static void caseSwap(String line){
        char[] a = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            a[i] = line.charAt(i);
        }
        for (int i = 0; i < line.length(); i++) {
            String b = a[i] + "";
            if ((int)a[i]==32){
                continue;
            }
            else if ((int)a[i]>96){
                b = b.toUpperCase();
            }
            else if ((int)a[i]<91){
                b = b.toLowerCase();
            }
            a[i] = b.charAt(0);
        }
        for (int i = 0; i < line.length(); i++) {
            System.out.print(a[i]);
        }
    }

}
