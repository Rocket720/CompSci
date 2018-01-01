package unit6;

import java.util.Scanner;

public class day3_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        int rand1 = (int) (Math.random()*(line.length()+1));
        int rand2 = (int) (Math.random()*((line.length()-rand1)+rand1));
        int rand3 = (int) (Math.random()* rand1);

        String a = ""+line.charAt(rand1);
        String b;
        String end;
        double flip = Math.random();
        if (flip>0.5){
            b=""+line.charAt(rand2);
            System.out.println(a);
            System.out.println(b);
            end=line.substring(0, rand1-1)+""+b+""+line.substring(rand1+1, rand2-1)+""+a+""+line.substring(rand2+1, line.length()-1);
        }
        else{
            b=""+line.charAt(rand3);
            System.out.println(a);
            System.out.println(b);
            end=line.substring(0, rand2-1)+""+a+""+line.substring(rand2+1, rand1-1)+""+b+""+line.substring(rand1+1, line.length()-1);
        }
        System.out.println(end);

    }

}
