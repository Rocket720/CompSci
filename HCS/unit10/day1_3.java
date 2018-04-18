package unit10;

import java.util.Scanner;

public class day1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (i+1)*2;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
