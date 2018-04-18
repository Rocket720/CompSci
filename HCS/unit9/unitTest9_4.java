package unit9;
public class unitTest9_4 {
    public static void main(String[] args) {
        double count = 0.0;
        int r = 0;
        int prev = 10;
        int rolls = 0;
        boolean done = true;
        for (int i = 0; i < 1000000; i++) {
            while (done){
                r = (int)(Math.random()*6)+1;
                if (prev==r){
                    done = false;
                }
                rolls++;
                prev = r;
            }
            count = count + rolls;
            rolls = 0;
            r = 0;
            prev = 10;
            done = true;
        }
        System.out.println(count/1000000.0);
    }
}
//answer is around 7 rolls
