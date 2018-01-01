package unit6;

import java.util.Scanner;

public class day2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.next();
        String up = line.toUpperCase();
        String dn = line.toLowerCase();

        if (line.length()==5){
            System.out.println(up.charAt(4)+""+dn.charAt(3)+""+up.charAt(2)+""+dn.charAt(1)+""+up.charAt(0));
        }
        else{
            System.out.println("NO! BAD HUMAN");
        }

    }

}
