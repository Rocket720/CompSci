package unit12;

import java.util.Scanner;

public class day1_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        System.out.println(num(val));

    }
    public static int num(int val){
        if (val%10==val){
            return (val%10);
        }
        else{
            return(num(val/10)+1);
        }

    }

}
