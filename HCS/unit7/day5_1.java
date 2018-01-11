package unit7;

import java.util.Scanner;

public class day5_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int val =  input.nextInt();
        int count = 0;
        for (int i = val; i > 1 ; i--) {
            if (((val%i)==0)&&(i!=val)){
                count++;
            }
        }
        if (count==0){
            System.out.println(val + " is a prime number");
        }
        else{
            System.out.println(val + " is not a prime number");
        }
    }

}

