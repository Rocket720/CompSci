package unit12;

import java.util.Scanner;

public class day3_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(findMin(49, 66, 44, 81, 92));

    }
    public static int findMin(int... a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

}
