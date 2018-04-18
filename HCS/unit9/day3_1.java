package unit9;

public class day3_1 {

    public static void main(String[] args) {
        double count = 0.0;
        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < 1000000; i++) {
            x = (Math.random()*2)-1;
            y = (Math.random()*2)-1;
            if ((x*x)+(y*y)<=1){
                count++;
            }
        }
        System.out.println(count*4/1000000.0);
    }

}
