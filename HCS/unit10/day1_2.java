package unit10;

import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        array[3] = input.nextInt();
        for (int i = 3; i > -1; i--) {
            System.out.print(array[i]+" ");
        }
    }

}
