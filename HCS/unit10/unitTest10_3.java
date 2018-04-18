package unit10;

import java.util.Scanner;

public class unitTest10_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many doubles you wanna input?");
        int num = input.nextInt();
        System.out.println("Enter them");
        double[] a = new double[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < num; i++) {
            total+=a[i];
        }
        double avg = total/num;

        double dif = 100000000;
        int pos = 0;
        for (int i = 0; i < num; i++) {
            if (Math.abs(avg-a[i])<dif){
                dif = Math.abs(avg-a[i]);
                pos = i;
            }
        }
        System.out.println("The double closest to the mean is " + a[pos]);
    }

}
