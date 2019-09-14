package unit12;

import java.util.Scanner;

public class day2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        System.out.println(myAbs(val));

    }
    public static int myAbs(int val){
        if (val<0){
            return (val*-1);
        }
        else{
            return(val);
        }
    }

}
