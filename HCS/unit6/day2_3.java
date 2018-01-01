package unit6;

import java.util.Scanner;

public class day2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String one = input.next();
        String two = input.next();

        if (one.charAt(0)>two.charAt(0)){
            System.out.println(one);
            System.out.println(two);
            if (one.length()>two.length()){
                System.out.println(one + " is longer");
            }
            else if(one.charAt(0)>two.charAt(0)){
                System.out.println(two + " is longer");
            }
            else{
                System.out.println("They are the same length ");
            }
        }
        else if (one.charAt(0)<two.charAt(0)){
            System.out.println(one);
            System.out.println(two);
            if (one.length()>two.length()){
                System.out.println(one + " is longer");
            }
            else if(one.charAt(0)>two.charAt(0)){
                System.out.println(two + " is longer");
            }
            else{
                System.out.println("They are the same length");
            }
        }

    }

}
