package unit7;

import java.util.Scanner;

public class day6_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int count = 1;
        int num = 0;
        while (val+1>count){
            if (((val%count)==0)&&((count%2)==0)){
                num++;
            }
            count++;
        }
        count = 1;
        System.out.print("There are " + num + " even factors: ");
        while (val+1>count){
            if (((val%count)==0)&&((count%2)==0)){
                System.out.print(count + " ");
            }
            count++;
        }

    }

}
