package unit6;

import java.util.Scanner;

public class day4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String l1 = input.next();
        String l2 = input.next();

        System.out.println(l1.length());
        System.out.println(l2.length());

        System.out.println(l2.charAt(l2.length()-1)+""+l1.substring(1, l1.length()-1)+""+l2.charAt(0)+" "+l1.charAt(l1.length()-1)+""+l2.substring(1, l2.length()-1)+""+l1.charAt(0));

    }

}
