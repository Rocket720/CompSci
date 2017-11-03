package unit4;

import java.util.Scanner;

public class unitTest4_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integers");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();

        int min = 0;
        int max = 0;

        if(x1>x2&&x1>x3){
            max = x1;
        }
        else if(x2>x1&&x2>x3){
            max = x2;
        }
        else if(x3>x1&&x3>x2){
            max = x3;
        }
        else{
            System.out.println("invalid");
        }
        if(x1<x2&&x1<x3){
            min = x1;
        }
        else if(x2<x1&&x2<x3){
            min = x2;
        }
        else if(x3<x1&&x3<x2){
            min = x3;
        }
        else{
            System.out.println("invalid");
        }

        System.out.println(min + " " + ((x1+x2+x3)-min-max) + " " + max);




    }

}
