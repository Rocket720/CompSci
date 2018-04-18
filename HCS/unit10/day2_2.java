package unit10;

import java.util.Scanner;

public class day2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double[] a = new double[(int)num];
        double[] b = new double[(int)num];
        int total = 0;
        for (int i = 0; i < num; i++) {
            a[i] = input.nextDouble();
        }
        for (int i = 0; i < num; i++) {
            total+=a[i];
        }
        for (int i = 0; i < num; i++) {
            int r = (int)(Math.random()*num);
            b[i]= a[r];
            while(a[i]==b[i]){
                r = (int)(Math.random()*num);
                b[i]= a[r];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print(b[i] + " ");
        }

    }

}
