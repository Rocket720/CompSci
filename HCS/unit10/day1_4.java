package unit10;

import java.util.Scanner;

public class day1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        int max = 0;
        int total = 0;
        for (int i = 0; i < 4; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if (max<array[i]){
                max = array[i];
            }
            total = total + array[i];
        }
        System.out.println("Average is " + total/4 + "% and the highest score is " + max);
    }

}
