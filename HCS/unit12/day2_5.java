package unit12;

import java.util.Scanner;

public class day2_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many");
        int num = input.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
            System.out.println(grade(a[i]));
        }
        int total = 0;
        for (int i = 0; i < num; i++) {
            total+=a[i];
        }
        System.out.println("Avg is a " + total/num + ", a " + grade(total/num));


    }
    public static char grade(int val){
        if (val>90){
            return ('A');
        }
        else if (val>80&&val<90){
            return ('B');
        }
        else if (val>70&&val<80){
            return ('C');
        }
        else if (val>60&&val<70){
            return ('D');
        }
        else {
            return ('F');
        }
    }

}
