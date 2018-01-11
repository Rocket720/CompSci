package unit7;

import java.util.Scanner;

public class day7_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line =  input.nextLine();
        int count = 0;
        int i = 0;
        while (i<line.length()) {
            if (((line.charAt(i))=='A')||((line.charAt(i))=='a')||((line.charAt(i))=='E')||((line.charAt(i))=='e')||((line.charAt(i))=='I')||((line.charAt(i))=='i')||((line.charAt(i))=='O')||((line.charAt(i))=='o')||((line.charAt(i))=='U')||((line.charAt(i))=='u')){
                count++;
            }
            i++;
        }
        System.out.println("'" + line + "' contains " + count + " vowels");
    }

}

