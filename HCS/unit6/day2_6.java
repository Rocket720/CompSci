package unit6;

import java.util.Scanner;

public class day2_6 {

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

            int rand = (int)Math.random()*6;

            switch (rand) {
                case 0:
                    System.out.println(a + "" + b + "" + c);
                    break;
                case 1:
                    System.out.println(a + "" + c + "" + b);
                    break;
                case 2:
                    System.out.println(b + "" + a + "" + c);
                    break;
                case 3:
                    System.out.println(b + "" + c + "" + a);
                    break;
                case 4:
                    System.out.println(c + "" + a + "" + b);
                    break;
                case 5:
                    System.out.println(c + "" + b + "" + a);
                    break;
            }
        }

    }

}
