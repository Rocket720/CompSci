package unit4;

import java.util.Scanner;

public class day2_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digits");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int max = Math.max(a, Math.max(b, Math.max(c, d)));
        int min = Math.min(a, Math.min(b, Math.min(c, d)));
        int total = ((a+b+c+d)-min)-max;

        int midMin = 0;
        int midMax = 0;

        if(total==(a+b)){
            midMin = Math.min(a, b);
            midMax = Math.max(a, b);
        }
        else if(total==(a+c)){
            midMin = Math.min(a, c);
            midMax = Math.max(a, c);
        }
        else if(total==(a+d)){
            midMin = Math.min(a, d);
            midMax = Math.max(a, d);
        }
        else if(total==(b+c)){
            midMin = Math.min(b, c);
            midMax = Math.max(b, c);
        }
        else if(total==(b+d)){
            midMin = Math.min(b, d);
            midMax = Math.max(b, d);
        }
        else if(total==(d+c)){
            midMin = Math.min(d, c);
            midMax = Math.max(d, c);
        }

        System.out.println("In ascending order, the numbers are " + min + ", " + midMin + ", " + midMax + ", " + max + "");
    }

}
