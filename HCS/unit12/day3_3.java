package unit12;

import java.util.Scanner;

public class day3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            x[i] = input.nextInt();
        }

        for (int i = 0; i < num; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        sortArray(x);
        System.out.println();


    }
    public static void sortArray(int [] x){
        boolean done = true;
        while(done){
            for (int i = 0; i < x.length-1; i++) {
                if(x[i]>x[i+1]){
                    int mid = x[i];
                    x[i] = x[i+1];
                    x[i+1] = mid;
                }
            }
            int count = 1;
            for (int i = 0; i < x.length-1; i++) {
                if (x[i]>x[i+1]){
                    count++;
                }
            }
            if (count==1){
                done = false;
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        cumulativeSum(x);
    }
    public static void cumulativeSum(int[] x){
        for (int i = 0; i < x.length; i++) {
            int count = 0;
            for (int j = 0; j < i+1; j++) {
                count += x[j];
            }
            System.out.print(count + " ");
        }
    }
}
