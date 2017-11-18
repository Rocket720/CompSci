package unit5;

import java.util.Scanner;

public class day5_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 0 if you would like to enter 2 endpoints");
        System.out.println("Enter 1 if you would like to enter 1 endpoint and the midpoint");

        int choice = input.nextInt();
        int x1, x2, y1, y2;
        double x, y;

        switch (choice) {
            case 0:
                System.out.println("Enter the x and y coords for the first endpoint");
                x1 = input.nextInt();
                y1 = input.nextInt();
                System.out.println("Enter the x and y coords of the second endpoint");
                x2 = input.nextInt();
                y2 = input.nextInt();

                x = (x1+x2)/2;
                y = (y1+y2)/2;
                System.out.println("The coords of the endpoints are (" + x + ", " + y + ")");

                break;
            case 1:
                System.out.println("Enter the x and y coords for the first endpoint");
                x1 = input.nextInt();
                y1 = input.nextInt();
                System.out.println("Enter the x and y coords of the midpoint");
                x2 = input.nextInt();
                y2 = input.nextInt();

                x = -1*(x1-(2*x2));
                y = -1*(y1-(2*y2));
                System.out.println("The coords of the other endpoint are (" + x + ", " + y + ")");

                break;

            default:
                System.out.println("How tf did you get here?");
                break;
        }
    }

}
