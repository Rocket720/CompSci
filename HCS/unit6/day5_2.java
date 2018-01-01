package unit6;

import java.util.Scanner;

public class day5_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        String wordUp = word.toUpperCase();
        String wordDn = word.toLowerCase();
        String last = (word.substring(1, word.length()-1));

        if((word.charAt(0)<123&&word.charAt(0)>96)&&(last.equals(wordUp.substring(1, word.length()-1)))){
            System.out.println("It's '" + wordUp.charAt(0)+""+wordDn.substring(1, word.length()) + "' you illiterate fool");
        }
        else{
            System.out.println("The word " + word + " is correct ");
        }

    }

}
