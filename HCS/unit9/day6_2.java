package unit9;

public class day6_2 {

    public static void main(String[] args){
        int heads1 = 0;
        int heads2 = 0;
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 12; j++) {
                int r = (int)(Math.random()*2);
                if (r==0){
                    heads1++;
                }
            }
            for (int j = 0; j < 16; j++) {
                int r = (int)(Math.random()*2);
                if (r==0){
                    heads2++;
                }
            }
            if (heads1==heads2){
                count++;
            }
            heads1 = 0;
            heads2 = 0;
        }
        System.out.println(count/1000000);
    }

}
