package unit12;

import java.util.Scanner;

public class unitTest12_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String line = input.nextLine();
        System.out.println("How many times");
        int num = input.nextInt();
        printSent(line, num);
    }
    public static void printSent(String line, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(line);
        }
    }

}
