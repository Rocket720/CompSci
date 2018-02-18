package unit8;
import java.util.Scanner;

public class day8_1{

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        String word = input.next();

        for (int i = word.length()-1; i > -1; i--) {
            System.out.print(word.charAt(i));
            System.out.print("  ");
        }

    }
}
