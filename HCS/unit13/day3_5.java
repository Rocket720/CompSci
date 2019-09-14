package unit13;

import java.util.Scanner;

import static java.lang.System.out;

public class day3_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        char[][] a = arrayGenLetter(10, 10);
        a = wsInsert(a, word);
        printArray(a);
    }
    public static char[][] arrayGenLetter(int x, int y){
        char[][] a = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = (char)((int)(Math.random()*26)+97);
            }
        }
        return a;
    }
    public static void printArray(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
    }

    public static char[][] wsInsert(char[][] a, String w1) {
        int r = (int) (Math.random()*2);
        String word = "";
        if (r==0){
            word=w1;
        }
        else if (r==1){
            for (int i = w1.length()-1; i > -1; i--) {
                word+=w1.charAt(i);
            }
        }

        r = (int) (Math.random()*4);
        if (r==0){
            int x = (int) (Math.random()*10);
            int y = (int) (Math.random()*(10-word.length()));
            int j = 0;
            for (int i = y; i < y+word.length(); i++) {
                a[x][i] = word.charAt(j);
                j++;
            }
        }
        else if(r==1){
            int x = (int) (Math.random()*(10-word.length()));
            int y = (int) (Math.random()*10);
            int j = 0;
            for (int i = x; i < x+word.length(); i++) {
                a[i][y] = word.charAt(j);
                j++;
            }
        }
        else if(r==2){
            int x = (int) (Math.random()*(10-word.length()+1));
            int y = (int) (Math.random()*(10-word.length()+1));
            for (int i = 0; i < word.length(); i++) {
                a[x][y] = word.charAt(i);
                x++;y++;
            }
        }
        else if(r==3){
            int x = 9 - ((int) (Math.random()*(10-word.length()+1)));
            int y = (int) (Math.random()*(10-word.length()+1));
            for (int i = 0; i < word.length(); i++) {
                a[x][y] = word.charAt(i);
                x--;y++;
            }
        }

        return a;
    }

}
