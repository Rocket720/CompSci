package unit6;

import java.util.Scanner;

public class day2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.next();
        char a = (char)((int)(line.charAt(0))+1);
        char b;
        if (line.equals("z")||line.equals("Z")){
            b = (char)(line.charAt(0)-25);
        }
        else{
            b = (char)(line.charAt(0)+1);
        }
        System.out.println(b);

    }

}
