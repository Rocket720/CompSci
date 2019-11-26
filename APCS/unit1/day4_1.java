//package unit1;
//
//import java.util.Scanner;
//
//import static java.lang.System.out;
//
//public class day4_1 {
//
//    public static void main(String[] args) {
//        double[] x = new double[6];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 6; i++) {
//            //x[i] = input.nextDouble();
//            x[i] = Math.random() * 100;
//        }
//        sortArray(x, false);
//        for (int i = 0; i < x.length; i++) {
//            out.print(x[i] + " ");
//        }
//    }
//
//    public static void sortArray(double[] x, boolean y) {
//        int ind = 0;
//        for (int j = 0; j < x.length; j++) {
//            double low = x[ind];
//            int lowind = ind;
//            for (int i = ind; i < x.length; i++) {
//                if (x[lowind] > x[i]) {
//                    low = x[i];
//                    lowind = i;
//                }
//            }
//            double temp = x[ind];
//            x[ind] = x[lowind];
//            x[lowind] = temp;
//            ind++;
//        }
//        if (!y) {
//            double[] z = x.clone();
//            for (int i = x.length - 1; i >= 0; i--) {
//                x[z.length - i-1] = z[i];
//            }
//        }
//    }
//}
