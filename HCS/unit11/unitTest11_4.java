package unit11;

import java.util.Scanner;

public class unitTest11_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers?");
        int num = input.nextInt();
        System.out.println("Enter em");
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
            b[i] = a[i];
        }
        for (int i = 0; i < 4; i++) {
            boolean done = true;
            while (done){
                for (int j = 0; j < num; j++) {
                    int r = (int)(Math.random()*num);
                    while (b[j]==1){
                        b[j] = a[r];

                    }
                }
            }
        }



    }

}
