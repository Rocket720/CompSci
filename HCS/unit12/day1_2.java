package unit12;

import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int bot = input.nextInt();
        int top = input.nextInt();
        int mid = Math.max(bot, top);
        bot = Math.min(bot, top);
        top = mid;
        System.out.println("The sum of all numbers from " + bot + " to " + top + " is " + sum(bot, top));
    }
    public static int sum(int bot, int top){
        int count = 0;
        for (int i = bot; i < top+1; i++) {
            count+=i;
        }
        return(count);
    }

}
