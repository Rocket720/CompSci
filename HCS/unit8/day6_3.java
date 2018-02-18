package unit8;
import java.util.Scanner;

public class day6_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int orig = input.nextInt();
        int num = orig;
        int val = num;
        int digits = 0;
        while (val!=0) {
            val /= 10;
            digits++;
        }
        int max = (int)Math.pow(10, digits);
        for (int i = 2; i < num+2; i++) {
            if (num%i==0&&max%i==0){
                num /= i;
                max /= i;
                i = 1;
            }
        }
        System.out.println("0."+orig+" = "+num+" / "+max);
    }

}
