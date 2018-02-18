package unit8;
import java.util.Scanner;
public class unitTest8_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many digits per line?");
        int dig = input.nextInt();
        System.out.println("How many lines?");
        int lin = input.nextInt();
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < dig; j++) {
                System.out.print((int)(Math.random()*10));
            }
            System.out.println();
        }
    }

}
