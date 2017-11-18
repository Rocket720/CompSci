package unit5;

import java.util.Scanner;

public class day3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how much money the government stole from you");
        double tax = input.nextDouble();
        if (tax>0&&tax<10000){
            System.out.println("The income for $" + tax + " is $" + (tax*10));
        }
        else if(tax>10000&&tax<30000){
            System.out.println("The income for $" + tax + " is $" + (((tax-10000)*20)+10000));
        }
        else if(tax>30000){
            System.out.println("Wow, you rich");
            System.out.println("The income for $" + tax + " is $" + (((tax-30000)*30)+30000));
        }
        else if(tax<0){
            System.out.println("Damn, get a job");
            System.out.println("No income for you");
        }

    }

}