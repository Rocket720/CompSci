package unit11;

import java.util.Scanner;

public class unitTest11_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter em");
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
            b[i] = a[i];
        }

        boolean done = true;
        while(done){
            for (int i = 0; i < num-1; i++) {
                if (b[i] < b[i+1]){
                    int mid = b[i];
                    b[i] = b[i+1];
                    b[i+1] = mid;
                }
            }
            int count = 0;
            for (int i = 0; i < num-1; i++) {
                if (b[i]<b[i+1]){
                    count++;
                }
            }
            if (count==0){
                done=false;
            }
        }
        System.out.println("Sorted: ");
        for (int i = 0; i < num; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Original: ");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
