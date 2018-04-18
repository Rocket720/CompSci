package unit9;

public class day5_2 {

    public static void main(String[] args) {
        int teens = 0;
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 30; j++) {
                int r = (int)(Math.random()*5);
                if(r==0) {teens++;}
            }
            if (teens==4||teens==5){
                count++;
            }
            teens=0;
        }
        System.out.println(count/1000000);
    }

}
