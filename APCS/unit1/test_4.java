import java.util.Scanner;
public class test_4{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double count = 0;
        while(true){
            int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
            System.out.println(a + " + " + b + " = ");
            if(input.nextInt()!=(a+b))
                break;
            count++;
        }
        System.out.println("Incorrect");
        System.out.println("You got " + (int)(count-1) + " out of " + (int)count + " questions correct, " + (int)(((count-1)/count)*100) + "% ");

    }

}