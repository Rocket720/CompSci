package unit9;

public class day7_3 {

    public static void main(String[] args) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int a = 0;
        double count = 0;
        for (int i = 0; i < 1000000; i++) {
            while (p1 == p2 || p1 == p3 || p1 == p4 || p2 == p3 || p2 == p4 || p3 == p4) {
                p1 = (int) (Math.random() * 12);
                p2 = (int) (Math.random() * 12);
                p3 = (int) (Math.random() * 12);
                p4 = (int) (Math.random() * 12);
            }
            if ((p1 < 5)^(p2 < 5)^(p3 < 5)^(p4 < 5)){
                a++;
            }
            if (a==1){
                count++;
            }
            a = 0;
        }
        System.out.println(count / 1000000.0);
    }
}
