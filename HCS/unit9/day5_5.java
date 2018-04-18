package unit9;

public class day5_5 {

    public static void main(String[] args) {
        int prev = 0;
        int streak = 1;
        int max = 0;
        int r = 2;
        double total = 0.0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 10; j++) {
                prev = r;
                r = (int)(Math.random()*2);
                if (prev==r){streak++;}
                else{streak=1;}


            }
            total += max;
            streak = 1;
            max = 0;
        }
        System.out.println(total/1000000);
    }

}
