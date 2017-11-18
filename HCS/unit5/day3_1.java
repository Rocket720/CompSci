package unit5;

import java.util.Scanner;

public class day3_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your annual income?");
        double income = input.nextDouble();

        if (income>0&&income<100000){
            System.out.println("The taxes on $" + income + " are $" + (income*0.1));
        }
        else if(income>100000&&income<200000){
            System.out.println("The taxes on $" + income + " are $" + (((income-100000)*0.2)+10000));
        }
        else if(income>200000){
            System.out.println("Wow, you rich");
            System.out.println("The taxes on $" + income + " are $" + (((income-200000)*0.3)+30000));
        }
        else if(income<0){
            System.out.println("Damn, get a job");
            System.out.println("No taxes for you");
        }

    }

}