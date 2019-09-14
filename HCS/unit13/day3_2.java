package unit13;

public class day3_2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random()*10);
            diagOne(num);
            System.out.println();
        }
    }
    public static void diagOne(int num){
        int[][] a = new int[num][num];
        for (int i = 0; i < num; i++) {
            a[i][i] = 1;
            a[i][num-i-1] = 1;
        }
        printArray(a);
    }
    public static void printArray(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}