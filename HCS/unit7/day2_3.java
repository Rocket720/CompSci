package unit7;

import java.util.Scanner;

public class day2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("The factors of " + a + " are:");
        for (int i = 1; i < a; i++) {
            if((a%i)==0){
                System.out.print(i+", ");
            }
        }
    }
}
