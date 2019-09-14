package unit12;

import java.util.Scanner;

public class unitTest12_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 1;
        while (true){
            System.out.println("Enter a value");
            num = input.nextInt();
            if (num==0){
                break;
            }
            sixFact(num);
        }

    }
    public static void sixFact(int num){
        if (num%6==0){
            System.out.println("6 is a factor of " + num);
        }
        else {
            System.out.println("6 is not a factor of " + num);
        }
    }

}
