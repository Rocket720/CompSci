package unit11;

import java.util.Scanner;

public class day1_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] a = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            a[i] = line.charAt(i);
        }
        int count = 0;
        for (int e : a) {
            if (e=='A'||e=='a'||e=='E'||e=='e'||e=='I'||e=='i'||e=='O'||e=='o'||e=='U'||e=='u'){
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no vowels");
        }
        else{
            System.out.println("There are " + count + " vowels");
        }
    }

}
