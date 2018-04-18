package unit12;

import java.util.Scanner;

public class day1_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int bot = input.nextInt();
        int top = input.nextInt();
        int mid = Math.max(bot, top);
        bot = Math.min(bot, top);
        top = mid;
        int count = 0;
        for (int i = bot; i < top+1; i++) {
            count+=i;
        }
        System.out.println("The sum of all numbers from " + bot + " to " + top + " is " + count);
    }

}
