package unit13;

public class day2_3 {

    public static void main(String[] args) {
        int[][] a = arrayGen(10, 10);
        printArray(a);
        System.out.println();
        arrayAnalysis(a);

    }
    public static int[][] arrayGen(int x, int y){
        int[][] a = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = (int)(Math.random()*10);
            }
        }
        return a;
    }
    public static void arrayAnalysis(int[][] a){
        int zero = 0; int one = 0; int two = 0; int three = 0; int four = 0; int five = 0; int six = 0; int seven = 0; int eight = 0; int nine = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int b = a[i][j];
                switch (b){
                    case 0: zero++; break;
                    case 1: one++; break;
                    case 2: two++; break;
                    case 3: three++; break;
                    case 4: four++; break;
                    case 5: five++; break;
                    case 6: six++; break;
                    case 7: seven++; break;
                    case 8: eight++; break;
                    case 9: nine++; break;
                }
            }
        }
        System.out.println("0 - " + zero);
        System.out.println("1 - " + one);
        System.out.println("2 - " + two);
        System.out.println("3 - " + three);
        System.out.println("4 - " + four);
        System.out.println("5 - " + five);
        System.out.println("6 - " + six);
        System.out.println("7 - " + seven);
        System.out.println("8 - " + eight);
        System.out.println("9 - " + nine);
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
