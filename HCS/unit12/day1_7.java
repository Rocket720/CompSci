package unit12;

import java.util.Scanner;

public class day1_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long val = input.nextLong();
        System.out.println(num(val));

    }
    public static int num(long val){
        if (val%10==val){
            return (1);
        }
        else{
            return(num(val/10)+1);
        }

    }

}
