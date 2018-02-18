package unit8;

import java.util.Scanner;

public class day1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int c = input.nextInt();
        int count = -10;
        System.out.println("The point on line y = "+s+"x + "+c+" are ");
        do {
            System.out.print("( "+count+", "+((count*s)+c)+"), ");
            count++;
        }
        while(count<10);

    }

}
