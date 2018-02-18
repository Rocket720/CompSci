package unit9;

public class day1_6 {

    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int hs = 0;
        int ts = 0;
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 10; j++) {
                int coin = (int) (Math.random() * 2);

                if (coin == 0) {
                    heads++;
                    tails = 0;
                } else if (coin == 1) {
                    tails++;
                    heads = 0;


                    if (heads == 3) {
                        count++;
                    }
                    if (tails == 3) {
                        count++;
                    }

                }
            }

        }
        System.out.println((1000000.0-(double)count)/1000000.0);
    }
}
