package unit9;

public class day4_4 {

    public static void main(String[] args) {

        int two=0;
        double prob3 = 0, three = 0, count = 0;
        for (int i = 0; i < 1000000; i++) {
            int prev = (int) (Math.random() * 2);
            int current = (int) (Math.random() * 2);
            count = 1;

            while (prev == current) {
                count++;
                current = (int) (Math.random() * 2);
            }

            if (count == 2) {
                two++;
            }
            else if (count == 3){
                three++;
            }
            else {
                i--;
            }
        }
        System.out.println(three/1000000);

    }

}
