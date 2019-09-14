package unit13;

import static java.lang.System.out;

public class day4_1 {

    public static void main(String[] args) {

        int[][] a = new int[20][20];
        a = randPos(a);
        printArray(a);

    }
    public static int[][] randPos(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int j = (int)(Math.random()*20);
            a[i][j] = j+2;
        }
        return a;
    }
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }
    }

}
