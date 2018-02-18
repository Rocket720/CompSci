package unit9;

public class day2_1 {

    public static void main(String[] args) {
        double count = 0.0;
        int dem = 0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 15; j++) {
                int r = (int)(Math.random()*3);
                if (r==0){
                    dem++;
                }
            }
            if (dem>=8){
                count++;
            }
            dem = 0;
        }
        System.out.println("There is a " + count/1000000.0);
    }
}
