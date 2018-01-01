package unit6;

import java.util.Scanner;

public class day3_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        char a = (char) ((int)(line.charAt(0))+1);

        if(line.charAt(0)==90||line.charAt(0)==122){
            a = (char) ((int)(line.charAt(0))-25);
        }
        System.out.println(a+""+line.substring(1, line.length()));
    }

}
