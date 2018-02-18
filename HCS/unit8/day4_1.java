package unit8;

import java.util.Scanner;

public class day4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int a = Math.min(v1, v2);
        int b = Math.max(v1, v2);
        int c = 0;
        for (int i = 1; i < b; i++) {
            if ((a*i)%b==0){
                c = a*i;
                break;
            }
        }
        if (c!=0){
            System.out.println(c);
        }
        else if (c==0){
            System.out.println(a*b);
        }

    }

}
