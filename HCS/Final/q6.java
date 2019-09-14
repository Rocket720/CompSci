package Final;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many ints?");
        int[] a = new int[input.nextInt()];
        System.out.println("Enter em!");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        double[] b = stats(a);

        System.out.println("Min - " + b[0]);
        System.out.println("Max - " + b[1]);
        System.out.println("Mean - " + b[2]);
    }
    public static double[] stats(int[] a){
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (double)(a[i]);
        }

        double min = b[0];
        for (int i = 0; i < a.length; i++) {
            if (b[i] < min){
                min = b[i];
            }
        }

        double max = b[0];
        for (int i = 0; i < a.length; i++) {
            if (b[i] > max){
                max = b[i];
            }
        }

        double count = 0;
        for (int i = 0; i < a.length; i++) {
            count+=b[i];
        }
        double mean = count/a.length;

        double[] fin = new double[3];
        fin[0] = min;
        fin[1] = max;
        fin[2] = mean;

        return fin;
    }

}
