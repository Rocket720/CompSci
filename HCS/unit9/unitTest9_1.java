package unit9;

public class unitTest9_1 {

    public static void main(String[] args) {
        double count = 0.0;
        int threes = 0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 8; j++) {
                int r = (int)(Math.random()*6)+1;
                if (r==3){
                    threes++;
                }
            }
            if (threes<4){
                count++;
            }
            threes = 0;
        }
        System.out.println(count/1000000.0);
    }

}
