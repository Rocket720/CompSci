package unit6;

import java.util.Scanner;

public class day5_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();

        if(word.length()!=1){
            System.out.println("BAD HuMAN");
        }
        else{
            System.out.println("The value of " + word + " is " + ((int)word.charAt(0)));
        }

    }

}
