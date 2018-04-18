package unit12;

import java.util.Scanner;

public class day1_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println(allCaps(word));

    }
    public static String allCaps (String word){
        return (word.toUpperCase());
    }

}
