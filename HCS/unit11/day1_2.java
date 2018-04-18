package unit11;

public class day1_2 {

    public static void main(String[] args) {
        int[] a = new int[45];
        for (int i = 0; i < 45; i++) {
            a[i] = (3*i) + 8;
        }
        for (int e: a) {
            System.out.println(e);
        }
    }

}
