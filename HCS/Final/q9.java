package Final;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();
        for (int i = 2; i < num+1; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.print(i + " ");
            }
        }
    }

}
//Thanks for the amazing year Mr. McCarvill. Between Precalc and CompSci this year has been amazing. I look forward to seeing you next year!
//P.S. I'll be sure to hand around APCS and ask Diva questions, for old times sake.
