package unit9;

public class day5_1 {

    public static void main(String[] args) {
        double count = 0.0;
        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < 1000000; i++) {
            x = (Math.random()*4);
            y = (Math.random()*15)+1;
            if (y>=Math.pow(2, x)&&y<=((15/4)*x+1)){
                count++;
            }
        }
        System.out.println(count/1000000.0);
    }

}
