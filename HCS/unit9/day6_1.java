package unit9;

public class day6_1 {

    public static void main(String[] args) {
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {
            int r1 = (int)(Math.random()*60);
            int r2 = (int)(Math.random()*60);
            if (r1>=r2+15|r1+5<=r2){
                count++;
            }
        }
        System.out.println(1-count/1000000);
    }

}
