package unit8;
import java.util.Scanner;
public class day5_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int c = input.nextInt();
        int x = 0;
        for (int i = 0; i<c;i++)
        {
            for (int j = 0;j<=i;j++)
            {

                System.out.print(word.charAt(x%word.length()));

                x++;
            }
            System.out.println();
        }

    }

}
