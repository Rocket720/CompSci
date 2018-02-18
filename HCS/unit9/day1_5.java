package unit9;

public class day1_5 {

    public static void main(String[] args) {

        int c = 0;
        int heads = 0;
        double count = 0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 100; j++) {
                c = (int)(Math.random()*2);
                if(c==0){heads++;}
            }
            if (heads>=55){
                count++;
            }
            heads = 0;
        }
        System.out.println("Odds of 55 heads is " + count/1000000.0);

    }

}
