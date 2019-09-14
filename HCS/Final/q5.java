package Final;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many questions?");
        int a = input.nextInt();
        System.out.println();
        int count = 0;
        for (int i = 0; i < a; i++) {
            int r1 = (int)(Math.random()*10);
            int r2 = (int)(Math.random()*10);
            System.out.println(r1 + " + " + r2);
            int val = input.nextInt();
            if (val==(r1+r2)){
                count++;
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect!");
            }
        }
        System.out.println(count + " out of " + a + " correct, " + ((double)count/(double)a)*100 + "%");
    }

}
