package unit11;

public class day1_3 {

    public static void main(String[] args) {

        int[] a = new int[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = (int)(Math.random()*10);
        }
        for (int e : a) {
            System.out.print(e);
        }
    }

}
