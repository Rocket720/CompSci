package unit9;

public class day5_4 {

    public static void main(String[] args) {
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {

            int r1 = (int)(Math.random()*9);
            int r2 = (int)(Math.random()*9);

            while(r1==r2){
                r1 = (int)(Math.random()*9);
                r2 = (int)(Math.random()*9);
            }

            if (((r1==0)&&(r2==1||r2==2))||((r2==0)&&(r1==1||r1==2))){
                count++;
            }

        }
        System.out.println(count/1000000);
    }

}
