package unit6;

import java.util.Scanner;

public class day3_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.next();

        if (a.equals("eth")||a.equals("het")||a.equals("teh")||a.equals("eht")||a.equals("hte")){
            System.out.println("The");
        }
        else{
            System.out.println(a);
        }


    }

}
