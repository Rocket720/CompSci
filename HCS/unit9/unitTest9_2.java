package unit9;
public class unitTest9_2 {
    public static void main(String[] args) {
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {
            int x = (int)(Math.random()*7);
            int y = (int)(Math.random()*5);
            if ((((-1*x*x)+(8*x)-12)>y)){
                count++;
            }
        }
        System.out.println(count/1000000.0);
    }
}
//answer is 0.285062 or 28.50%
