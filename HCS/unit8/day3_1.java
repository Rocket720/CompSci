package unit8;

public class day3_1 {

    public static void main(String[] args) {
        System.out.println("A");
        int pos = 0;
        for (int i = 0; i < 100; i++) {

            double rand = Math.random();
            if (rand<0.5){
                pos--;
            }
            else if (rand>0.5){
                pos++;
            }
            if (pos<0){
                pos = 1;
            }
            for (int j = 0; j < pos; j++) {
                System.out.print(" ");
            }
            System.out.print("A");
            System.out.println();
        }

    }
}
