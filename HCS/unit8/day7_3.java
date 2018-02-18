package unit8;
import java.util.Scanner;

public class day7_3{

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        int n1 = input.nextInt();
        int d1 = input.nextInt();
        int n2 = input.nextInt();
        int d2 = input.nextInt();

        int fd=d1*d2;
        int num = n1*d2+n2*d1;

        int min = Math.min(num, fd);
        for (int i=min;i>1;i--)
        {
            if (num%i==0&&fd%i==0)
            {
                num/=i;
                fd/=i;
                break;
            }
        }
        System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+num+"/"+fd);

    }
}
