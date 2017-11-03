package unit4;

import java.util.Scanner;

public class day2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an x-value for the circle");
        int x = input.nextInt();
        System.out.println("Enter an radius for the circle");
        int r = input.nextInt();
        System.out.println("Do you want a positive or negative y-value?");
        String pos = input.next();

        if(pos.equals("pos")||pos.equals("positive")||pos.equals("Pos")||pos.equals("Positive")){
            int yval = (int) (Math.sqrt(Math.pow(r, 2)-Math.pow(x, 2)));
            System.out.println("The y-value is " + yval);
        }
        else if(pos.equals("neg")||pos.equals("negative")||pos.equals("Neg")||pos.equals("Negative")){
            int yval = (int) ((Math.sqrt(Math.pow(r, 2)-Math.pow(x, 2)))*(-1));
            System.out.println("The y-value is " + yval);
        }

    }

}
