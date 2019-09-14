package unit13;

import static java.lang.System.out;

public class day3_3 {

    public static void main(String[] args) {
        char[][] a = arrayGenLetter(10, 10);
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

}
