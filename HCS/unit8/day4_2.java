package unit8;

import java.util.Scanner;

public class day4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int a = Math.min(v1, v2);
        int b = Math.max(v1, v2);
        int c = 0;

        for (int i = a; i > 1; i--) {
            if ((b%i)==0&&(a%i)==0){
                c = i;
                break;
            }
        }
        if (c!=0){
            System.out.println(c);
        }
        else if (c==0){
            System.out.println("THOSE ARE 2 PRIME NUMBER YOU DIPWAD");
        }

    }

}
