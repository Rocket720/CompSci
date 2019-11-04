//package unit1;
//
//import java.util.Scanner;
//
//import static java.lang.System.out;
//
//public class day5_2 {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        out.println("how many number stupidhead");
//        double[] x = new double[input.nextInt()];
//        out.println("Enter nomber plox");
//        for (int i = 0; i < x.length; i++) {
//            x[i] = input.nextDouble();
//        }
//        double[] z = x.clone();
//        for (int i = x.length - 1; i >= 0; i--) {
//            x[z.length - i-1] = z[i];
//        }
//        out.println("ere ya go brada");
//        for (int i = 0; i < x.length; i++) {
//            out.println(x[i] + " ");
//        }
//
//    }
//
//}
