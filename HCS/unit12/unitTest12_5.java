package unit12;

import java.util.Scanner;

public class unitTest12_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        int[] y = arrayMaker(x);
        doubleElements(y);
        add3(y);
        for (int i = 0; i < y.length; i++) {
            System.out.print(y+" ");
        }
    }
    public static int[] arrayMaker(int x){
        int[] y = new int[x];
        for (int i = 0; i < x; i++) {
            y[i] = i+1;
        }
        return (y);
    }
    public static void doubleElements(int[] y){
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i]*2;
        }
    }
    public static void add3(int[] y){
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] + 3;
        }
    }

}
