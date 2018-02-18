package unit8;

import java.util.Scanner;

public class day8_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int a = Math.min(Math.min(x, y), z);
        int c = Math.max(Math.max(x, y), z);
        int b = x+y+z-a-c;

        int count = a;
        while (!(count%a==0&&count%b==0&&count%c==0)){
            count++;
        }
        System.out.println(count);

    }

}
