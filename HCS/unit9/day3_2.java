package unit9;

public class day3_2 {

    public static void main(String[] args) {
        double count = 0.0;
        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < 1000000; i++) {
            x = (Math.random()*3)-1;
            y = (Math.random()*3)-1;
            if ((x*x*(-1))+y<4&&x>0&&y>0){
                count++;
            }
        }
        System.out.println(count/1000000.0);
    }

}
