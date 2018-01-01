package unit7;

import java.util.Scanner;

public class day2_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        double d = 0;
        for (int i = 0; i < 5; i++) {
            a = (int)(Math.random()*10);
            b = (int)(Math.random()*10);
            System.out.println(a + " + " + b);
            c = input.nextInt();
            if (c == (a+b)){
                d++;
                System.out.println("Correct");
            }
            else{
                System.out.println("No ur dumb");
            }
        }
        System.out.println("You got " + (int)d + " out of 5 correct, " + (d/5)*100 + "%");
    }
}
