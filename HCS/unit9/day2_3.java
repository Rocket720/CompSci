package unit9;

public class day2_3 {

    public static void main(String[] args) {
        int tails = 0;
        boolean two = false;
        int tries = 0;
        double turns = 0.0;
        for (int i = 0; i < 1000000; i++) {
            while(two==false){
                int r = (int)(Math.random()*2);
                if (r==0){
                    tails++;
                }
                if (tails==2){
                    turns++;
                    two = true;
                }
                tries++;
            }
            two = false;
            tails = 0;
        }
        System.out.println("There is a " + turns/1000000.0);
    }
}
