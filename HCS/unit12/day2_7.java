package unit12;

import java.util.Scanner;

public class day2_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many");
        int num = input.nextInt();
        int[] a = sortArray(rollDice(num));
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] rollDice(int num){
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = (int)(Math.random()*6)+1;
        }
        return a;
    }
    public static int[] sortArray(int[] b){
        int[] a = b;
        boolean done = true;
        while (done){
            for (int i = 0; i < a.length-1; i++) {
                if (a[i]>a[i+1]){
                    int mid = a[i];
                    a[i] = a[i+1];
                    a[i+1] = mid;
                }
            }
            int count = 0;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i]>a[i+1]){
                    count++;
                }
            }
            if (count==0){
                done = false;
            }
        }
        return (a);
    }

}
