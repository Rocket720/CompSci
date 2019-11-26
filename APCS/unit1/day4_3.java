//package unit1;
//
//import java.util.Scanner;
//
//import static java.lang.System.out;
//
//public class day4_3 {
//
//    public static void main(String[] args) {
//        char[][] board = new char[10][10];
//        Scanner input = new Scanner(System.in);
//        board = gen(board);
//        String word = input.next();
//        int x = (int) (Math.random() * 10);
//        int y = (int) (Math.random() * (10 - word.length()));
//        for (int i = 0; i < word.length(); i++) {
//            board[x][y+i] = word.charAt(i);
//        }
//        printArray(board);
//    }
//
//    public static void printArray(char[][] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                out.print(a[i][j] + " ");
//            }
//            out.println();
//        }
//    }
//
//    public static char[][] gen(char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                board[i][j] = (char) ((int) (Math.random() * 26) + 97);
//            }
//        }
//        return board;
//    }
//}
