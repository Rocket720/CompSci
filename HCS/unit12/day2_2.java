package unit12;

import java.util.Scanner;

public class day2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int val2 = input.nextInt();
        int val3 = input.nextInt();
        System.out.println(max(val, val2, val3));

    }
    public static int max(int val, int val2, int val3){
        return (Math.max(val, Math.max(val2, val3)));
    }

}
