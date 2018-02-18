package unit9;

public class day2_5 {

    public static void main(String[] args) {
        double total = 0;
        boolean stop = false;
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {

            while (!stop){

                int r = (int)(Math.random()*3);

                if (r==0){
                    total=total+0.05;
                }
                else if (r==1){
                    total=total+0.10;
                }
                else if (r==2){
                    total=total+0.25;
                }

                if (total==1.00){
                    count++;
                    stop=true;
                }
                else if(total>1.00){
                    stop=true;
                }
            }
            stop = false;
            total = 0.0;
        }
        System.out.println(count/1000000.0);
    }

}
