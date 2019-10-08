public class day6_1 {
    public static void main(String[] args) {
        int[] a = new int[10]/*{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }*/;randomFill(a, 0, 10);
        int[][] b = new int[3][3]/*{ { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } }*/;randomFill(b, 10, 20);

        printArray(a);
        printArray(b);

    }

    public static void printArray(int[] x) {
        String c = "[ ";
        for (int i = 0; i < x.length; i++) {
            c += x[i] + ", ";
        }
        c = c.substring(0, c.length() - 2);
        c += "]";
        System.out.println(c);
    }

    public static void printArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            printArray(x[i]);
        }
    }

    public static void randomFill(int[] j, int min, int max) {
        for (int i = 0; i < j.length; i++) {
            j[i] = (int) (Math.random() * (max - min)) + min;
        }
    }

    public static void randomFill(int[][] j, int min, int max) {
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < j[i].length; k++) {
                j[i][k] = (int)(Math.random()*(max-min))+min;
            }
        }
    }

}