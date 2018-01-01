package unit6;

import java.util.Scanner;

public class day3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String ml = "m";
        String mu = "M";
        if(line.charAt(0)>96){
            line = ml.concat(line.substring(1, line.length()));
        }
        else if(line.charAt(0)<91){
            line = mu.concat(line.substring(1, line.length()));
        }
        System.out.println(line);

    }

}
