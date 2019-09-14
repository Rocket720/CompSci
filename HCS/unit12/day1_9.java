package unit12;

import java.util.Scanner;

public class day1_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int val2 = input.nextInt();
        System.out.println(num(val, val2));

    }
    public static int num(int val, int val2){
        int count = 0;
        for (int i = val+1; i < val2; i++) {
            count+=i;
        }
        return(count);
    }

}
