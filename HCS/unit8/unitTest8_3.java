package unit8;
import java.util.Scanner;
public class unitTest8_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 integers");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int a = Math.min(x, Math.min(y, z));
        int c = Math.max(x, Math.max(y, z));
        int b = x + y + z - a - c;

        int gcf = 0;
        for (int i = 1; i < a; i++) {
            if (a%i==0&&b%i==0&&c%i==0){
                gcf = i;
            }
            System.out.println(gcf);
        }
        System.out.println("The GCF is " + gcf);
    }

}
