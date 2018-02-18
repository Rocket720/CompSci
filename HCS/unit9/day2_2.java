package unit9;

public class day2_2 {

    public static void main(String[] args) {
        double count = 0.0;
        int six = 0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 20; j++) {
                int r = (int)(Math.random()*6)+1;
                if (r==6){
                    six++;
                }
            }
            if (six==0){
                count++;
            }
            six = 0;
        }
        System.out.println("There is a " + count/1000000.0);
    }
}
