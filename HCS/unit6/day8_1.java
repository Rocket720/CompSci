package unit6;

import java.util.Scanner;

public class day8_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String num = input.next();
        int a = (int) num.charAt(2);
        int b = (int) num.charAt(1);
        int c = (int) num.charAt(0);

        //a
        if(a>96&&a<103){a=a-97+10;}
        else if(a>47&&a<58){a=a-48;}

        //b
        if(b>96&&b<103){b=b-97+10;}
        else if(b>47&&b<58){b=b-48;}

        //c
        if(c>96&&c<103){c=c-97+10;}
        else if(c>47&&c<58){c=c-48;}

        System.out.println((256*c)+(16*b)+a);
    }

}
