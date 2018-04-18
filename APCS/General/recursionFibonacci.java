package General;

import java.util.Scanner;

public class recursionFibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(fib(input.nextInt()));

    }
    public static long fib(int n){
        if (n<=1){
            return((long)n);
        }
        else{
            return (fib(n-1)+fib(n-2));
        }
    }

}
