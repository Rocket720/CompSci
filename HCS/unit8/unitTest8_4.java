package unit8;
import java.util.Scanner;
public class unitTest8_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many questions do you want to answer?");
        int qs = input.nextInt();
        int s = 0;

        for (int i = 0; i < qs; i++) {
            int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
            System.out.println(a + " + " + b);
            int c = input.nextInt();
            if (c==(a+b)){
                s++;
            }
        }
        System.out.println("You answered " + s + " questions correct, " + (int)(((double)s)/((double)(qs))*100) + "% ");
    }

}
