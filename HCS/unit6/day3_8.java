package unit6;

import java.util.Scanner;

public class day3_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String l1 = input.next();
        String l2 = input.next();
        int rand;

        System.out.println(l1.length());
        System.out.println(l2.length());

        if (l1.length()<l2.length()){
            rand = (int) Math.random()*l1.length();
            System.out.println(l1.charAt(0)+l1.substring(0, rand)+l2.charAt(rand+1)+l1.substring(rand+2, l1.length())+" "+l2.charAt(0)+l2.substring(0, rand)+l1.charAt(rand+1)+l2.substring(rand+2, l2.length()));
        }
        else if (l2.length()<l1.length()){
            rand = (int) Math.random()*l2.length();
            System.out.println(l1.charAt(0)+l1.substring(0, rand)+l2.charAt(rand+1)+l1.substring(rand+2, l1.length())+" "+l2.charAt(0)+l2.substring(0, rand)+l1.charAt(rand+1)+l2.substring(rand+2, l2.length()));
        }

    }

}
