package unit7;

import java.util.Scanner;

public class day1_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (int i = 1; i < 10; i++) {
            System.out.print(name.toUpperCase()+" ");
        }

    }

}
