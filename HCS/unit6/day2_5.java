package unit6;

import java.util.Scanner;

public class day2_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.next();

        if (line.length()!=3){
            System.out.println("BAD HUMAN");
        }
        else{
            line = line.toLowerCase();

            char a = line.charAt(0);
            char b = line.charAt(1);
            char c = line.charAt(2);

            char min = (char) Math.min(Math.min(a, b), c);
            char max = (char) Math.max(Math.max(a, b), c);
            char mid = (char) (a+b+c-min-max);

            System.out.println(min+""+mid+""+max);

        }

    }

}
