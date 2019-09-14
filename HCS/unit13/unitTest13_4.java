package unit13;

import static java.lang.System.out;

public class unitTest13_4 {

    public static void main(String[] args) {

        char[][] a = new char[12][12];
        a = charFill(a);
        a = arkIn(a);
        printArray(a);
    }

    public static char[][] charFill(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (char)((int)(Math.random()*26+97)) ;
            }
        }
        return a;
    }

    public static char[][] arkIn(char[][] a) {
        String ark = "ARKANSAS";
        int x = (int)(Math.random()*12);
        int y = (int)(Math.random()*(12-8));
        int val = 0;
        for (int i = y; i < y+8; i++) {
            a[x][i] = ark.charAt(val);
            val++;
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

}
