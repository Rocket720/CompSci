package unit1;

import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.substring(1, str.length()-1);
        str = str;
        System.out.println(reverse(str));
    }
    static String reverse(String a){
        String b = "";
        for (int i = a.length()-1; i >= 0; i--) {
            b+=a.charAt(i);
        }
        return b;
    }

}
