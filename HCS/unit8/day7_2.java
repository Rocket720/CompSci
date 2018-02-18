package unit8;
import java.util.Scanner;

public class day7_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        int split = (100-word.length())/(word.length()-1);
        for (int i = 0; i < word.length(); i++) {

            System.out.print(word.charAt(i));
            for (int j = 0; j < split; j++) {
                System.out.print(" ");
            }

        }
    }

}
