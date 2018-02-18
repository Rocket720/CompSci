package unit8;

import java.util.Scanner;

public class day2_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many digits for 1st number?");
        int dig1 = input.nextInt();
        System.out.println("How many digits for 2nd number?");
        int dig2 = input.nextInt();
        System.out.println("How many questions?");
        int qs = input.nextInt();
        int x = 0;
        int tries = 0;
        int score = 0;
        for (int i = 0; i < qs; i++) {
            int a = (int)(Math.random()*Math.pow(10, dig1));
            int b = (int)(Math.random()*Math.pow(10, dig2));
            x = a+b;
            do{
                System.out.println(a+" + "+b);
                tries++;
                System.out.println(tries);
            }
            while(x!=input.nextInt());
            if (tries==1){
                System.out.println("Correct!");
                score++;
                tries=0;
            }
            else{
                System.out.println("Incorrect, try again");
            }
        }
        System.out.println("You answered "+score+" out of "+qs+" on the first try. "+((double)score/qs)*100+"%");
    }
}
