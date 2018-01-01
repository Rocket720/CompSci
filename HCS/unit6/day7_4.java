package unit6;

import java.util.Scanner;

public class day7_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String w1 = input.next();
        String w2 = input.next();
        String w3 = input.next();
        String min = "";

        if(Math.min(w1.length(), Math.min(w2.length(), w3.length()))==w1.length()){
            min = w1;
        }
        else if(Math.min(w1.length(), Math.min(w2.length(), w3.length()))==w2.length()){
            min = w2;
        }
        else if(Math.min(w1.length(), Math.min(w2.length(), w3.length()))==w3.length()){
            min = w3;
        }

        int rand =(int) (min.length()*Math.random());

        String fw1 = w1.substring(0, rand)+w2.substring(rand, rand+1)+w1.substring(rand+1);
        String fw2 = w2.substring(0, rand)+w3.substring(rand, rand+1)+w2.substring(rand+1);
        String fw3 = w3.substring(0, rand)+w1.substring(rand, rand+1)+w3.substring(rand+1);

        System.out.println(fw1+" "+fw2+" "+fw3);
    }

}
