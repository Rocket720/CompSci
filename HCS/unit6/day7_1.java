package unit6;

import java.util.Scanner;

public class day7_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        int rand = ((int)(Math.random()*word.length()))-1;
        System.out.println(rand);
        String r = ""+word.charAt(rand);
        String fin;
        if((int)word.charAt(rand)>97){
            fin = word.substring(0, rand)+""+r.toUpperCase()+""+word.substring(rand+1, word.length());
        }
        else{
            fin = word.substring(0, rand)+""+r.toUpperCase()+""+word.substring(rand+1, word.length());
        }
        System.out.println(fin);

    }

}
