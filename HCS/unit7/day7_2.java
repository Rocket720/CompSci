package unit7;

import java.util.Scanner;

public class day7_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int val =  input.nextInt();
        int count = 0;
        int x = 1;
        while (x<val) {
            if (((val%x)==0)&&(x!=val)&&(x!=1)){
                count++;
            }
            x++;
        }
        if (count==0){
            System.out.println(val + " is a prime number");
        }
        else{
            System.out.println(val + " is not a prime number");
        }
    }

}

