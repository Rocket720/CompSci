package unit8;

import java.util.Scanner;

public class day5_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double now = System.currentTimeMillis()/1000;
        int val;
        int score = 0;
        int wrong = 0;
        while ((System.currentTimeMillis()/1000)-now<60){
            int rand = (int)(Math.random()*2);
            int a = 0;
            int b = 0;
            if (rand==0){
                a = (int) (Math.random()*10);
                b = (int) (Math.random()*10);
                System.out.println(a + " + " + b);
                val = input.nextInt();
                if (val==(a+b)){
                    score++;
                }
                else{
                    wrong++;
                }
            }
            else if(rand==1){
                a = (int) (Math.random()*10);
                b = (int) (Math.random()*a);
                System.out.println(a + " - " + b);
                val = input.nextInt();
                if (val==(a-b)&&(System.currentTimeMillis()/1000)-now<60){
                    score++;
                }
                else{
                    wrong++;
                }
            }
        }
        System.out.println(score+" correct");
        System.out.println(wrong+" wrong");
        System.out.println(score-wrong+" final");
    }
}
