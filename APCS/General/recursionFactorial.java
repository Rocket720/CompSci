package General;

import java.util.Scanner;

public class recursionFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(fac(input.nextInt()));

    }
    public static long fac(int n){

        if (n==1){
            return (1);
        }
        else{
            return (n * fac(n-1));
        }

    }

}
