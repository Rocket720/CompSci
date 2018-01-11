package unit7;

import java.util.Scanner;

public class day4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int val = 1;
        int loops = 0;
        while(val!=0){
            val = input.nextInt();
            count = count + val;
            System.out.println(count);
            loops++;
        }
        System.out.println(loops + " were made and the final value is " + count);
    }

}
