package unit10;

import java.util.Scanner;

public class day2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double[] a = new double[(int)num];
        int above = 0;
        int total = 0;
        for (int i = 0; i < num; i++) {
            a[i] = input.nextDouble();
        }
        for (int i = 0; i < num; i++) {
            total+=a[i];
        }
        System.out.println("avg = " + total/num);
        for (int i = 0; i < num; i++) {
            if (total/num<a[i]){
                above++;
            }
        }
        System.out.println("There are " + above + " number above");
    }

}
