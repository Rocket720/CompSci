package unit9;

public class day4_1 {

    public static void main(String[] args) {
        double count = 0.0;
        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < 1000000; i++) {
            x = (Math.random()*7)-3;
            y = (Math.random()*8)+1;
            if ((x*x)+y<9&&x>0){
                count++;
            }
        }
        System.out.println(count/1000000.0);
    }

}
