package unit11;

import java.util.Scanner;

public class day2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers");
        int num = input.nextInt();
        int a[] = new int[num];
        System.out.println("Enter'm");
        for (int i = 0; i < num; i++) {
            a[i]=input.nextInt();
        }
        int count = 0;
        for (int e : a) {
            if (e%2==1){
                count++;
            }
        }
        System.out.println("There were " + count + " odds");
    }

}
