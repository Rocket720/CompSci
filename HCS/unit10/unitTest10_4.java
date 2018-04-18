package unit10;

import java.util.Scanner;

public class unitTest10_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers you wanna input?");
        int num = input.nextInt();
        System.out.println("Enter them");
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }

        int max = 0;
        for (int i = 0; i < num; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        int low1 = max;
        for (int i = 0; i < num; i++) {
            if (a[i]<low1){
                low1 = a[i];
            }
        }

        boolean done = false;
        for (int i = 0; i < num; i++) {
            if (a[i]==low1&&done){
                done = true;
                continue;
            }
            b[i] = a[i];
        }

        int max2 = 0;
        for (int i = 0; i < num; i++) {
            if (b[i]>max2){
                max2 = b[i];
            }
        }
        int low2 = max2;
        for (int i = 0; i < num; i++) {
            if (b[i]<low2){
                low2 = b[i];
            }
        }

        System.out.println("The lowest numbers are " + low1 + " and " + low2);
    }

}
