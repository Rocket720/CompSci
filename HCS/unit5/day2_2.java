package unit5;

import java.util.Scanner;

public class day2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current year");
        int year = input.nextInt();

        System.out.println("Enter a year");
        int val = input.nextInt();

        if(val%4==0){
            if(val%100==0&&val%400!=0){
                if(val==year){
                    System.out.println(val + " is not a leap year");
                }
                else if(val<year){
                    System.out.println(val + " was not a leap year");
                }
                else if(val>year){
                    System.out.println(val + " will not be a leap year");
                }
            }
            else{
                if(val==year){
                    System.out.println(val + " is a leap year");
                }
                else if(val<year){
                    System.out.println(val + " was a leap year");
                }
                else if(val>year){
                    System.out.println(val + " will be a leap year");
                }
            }
        }
        else{
            if(val==year){
                System.out.println(val + " is not a leap year");
            }
            else if(val<year){
                System.out.println(val + " was not a leap year");
            }
            else if(val>year){
                System.out.println(val + " will not be a leap year");
            }
        }

    }

}
