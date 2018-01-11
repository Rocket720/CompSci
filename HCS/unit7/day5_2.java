package unit7;

import java.util.Scanner;

public class day5_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        int r1 = 0;
        int r2 = 0;
        String wordF = "";
        for (int i = 0; i < 100; i++) {
            r1 = (int) (Math.random()*word.length());
            r2 = (int) (Math.random()*word.length());
            while(r1==r2){
                r2 = (int) (Math.random()*word.length());
            }
            int rs1 = Math.min(r1, r2);
            int rs2 = Math.max(r1, r2);
            wordF = word.substring(0, rs1) + word.charAt(rs2) + word.substring(rs1, rs2) + word.charAt(rs1) + word.substring(rs2, word.length()-1);
        }
        System.out.println(wordF);
    }
}

