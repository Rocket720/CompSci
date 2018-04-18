package unit11;

import java.util.Scanner;

public class unitTest11_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many do you want to enter");
        int num = input.nextInt();
        System.out.println("Enter em");
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }
        int[] b = new int[num];
        b = a;
        boolean done = true;
        while(done){
            for (int i = 0; i < num; i++) {
                int r = (int)(Math.random()*num);
                b[i] = a[r];
            }
            int count = 0;
            for (int i = 0; i < num; i++) {
                if (a[i]==b[i]){
                    count++;
                }
            }
            if (count==0){
                done = false;
            }

            for (int i = 0; i < num; i++) {
                System.out.print(b[i]);
            }
            System.out.println();
        }
        //sum
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum+=a[i];
        }
        System.out.println("Sum is " + sum);

        //avg
        int avg = sum/num;
        System.out.println("The average is " + avg);

        //min
        done = true;
        int[] c = a;
        while(done){
            for (int i = 0; i < num-1; i++) {
                if (c[i] < c[i+1]){
                    int mid = c[i];
                    c[i] = c[i+1];
                    c[i+1] = mid;
                }
            }
            int count = 1;
            count = 0;
            for (int i = 0; i < num-1; i++) {
                if (c[i]<c[i+1]){
                    count++;
                }
            }
            if (count==0){
                done=false;
            }
        }
        System.out.println("The min is " + c[0]);
        System.out.println("The max is " + c[num-1]);


    }

}
