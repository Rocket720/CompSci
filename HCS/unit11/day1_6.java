package unit11;

import java.util.Scanner;

public class day1_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String space = input.nextLine();
        String line = input.nextLine();
        char[] a = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            a[i] = line.charAt(i);
        }
        int count = 0;
        for (int e : a) {
            if (e=='1'){
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no 1s");
        }
        else{
            System.out.println("There are " + count + " 1s");
        }
    }

}
