package unit8;
import java.util.Scanner;

public class day7_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        String up = word.toUpperCase();
        String dn = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i%2==0){
                System.out.print(up.charAt(i));
            }
            else{
                System.out.print(dn.charAt(i));
            }
            System.out.println();
        }
    }

}
