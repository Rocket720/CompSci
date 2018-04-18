package unit11;

import java.util.Scanner;

public class day2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int)(Math.random()*10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Whats the number you want?");
        int target = input.nextInt();
        int count = 0;
        for (int e :a) {
            if (e==target){
                count++;
            }
        }
        System.out.println("There are " + count + " " + target + "s");
    }

}
