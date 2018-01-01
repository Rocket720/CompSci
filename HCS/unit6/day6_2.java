package unit6;

import java.util.Scanner;

public class day6_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();
        String name="";
        int n = 0;

        switch(month){
            case(1):n=day;break;
            case(2):n=day+31;break;
            case(3):n=day+31+28;break;
            case(4):n=day+31+28+31;break;
            case(5):n=day+31+28+31+30;break;
            case(6):n=day+31+28+31+30+31;break;
            case(7):n=day+31+28+31+30+31+30;break;
            case(8):n=day+31+28+31+30+31+30+31;break;
            case(9):n=day+31+28+31+30+31+30+31+31;break;
            case(10):n=day+31+28+31+30+31+30+31+31+30;break;
            case(11):n=day+31+28+31+30+31+30+31+31+30+31;break;
            case(12):n=day+31+28+31+30+31+30+31+31+30+31+30;break;
        }
        switch(n%7){
            case(0):name="Saturday";break;
            case(1):name="Sunday";break;
            case(2):name="Monday";break;
            case(3):name="Tuesday";break;
            case(4):name="Wednesday";break;
            case(5):name="Thursday";break;
            case(6):name="Friday";break;

        }

        System.out.println(month+"/"+day+"/2017 is a "+name);

    }

}

//Saturday is a Wednesday