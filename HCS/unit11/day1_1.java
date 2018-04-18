package unit11;

public class day1_1 {

    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        for (int i:a) {
            System.out.println(a[i] + " ");
        }
    }

}
