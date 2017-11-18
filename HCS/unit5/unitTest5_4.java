package unit5;

import java.util.Scanner;

public class unitTest5_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer 1-10");
        int val = input.nextInt();

        switch (val){
            case 10:
                System.out.println(9);
                System.out.println(7);
                System.out.println(5);
                System.out.println(3);
                System.out.println(1);
                break;
            case 9:
                System.out.println(9);
                System.out.println(7);
                System.out.println(5);
                System.out.println(3);
                System.out.println(1);
                break;
            case 8:
                System.out.println(7);
                System.out.println(5);
                System.out.println(3);
                System.out.println(1);
                break;
            case 7:
                System.out.println(7);
                System.out.println(5);
                System.out.println(3);
                System.out.println(1);
                break;
            case 6:
                System.out.println(5);
                System.out.println(3);
                System.out.println(1);
                break;
            case 5:
                System.out.println(5);
                System.out.println(3);
                System.out.println(1);
                break;
            case 4:
                System.out.println(3);
                System.out.println(1);
                break;
            case 3:
                System.out.println(3);
                System.out.println(1);
                break;
            case 2:
                System.out.println(1);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }

}
