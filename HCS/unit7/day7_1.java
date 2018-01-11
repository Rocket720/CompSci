package unit7;

import java.util.Scanner;

public class day7_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int val2 = input.nextInt();
        int count = Math.min(val, val2);
        int max = Math.max(val, val2);
        int sum = 0;
        while (count<max){
            if ((count%5)==0){
                sum = sum+count;
            }
            count++;
        }
        System.out.println(sum);
    }

}
