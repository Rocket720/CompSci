package unit9;
public class unitTest9_3 {
    public static void main(String[] args) {
        double count = 0.0;
        int total = 0;
        for (int i = 0; i < 1000000; i++) {
            while(!(total>=100)){
                int r = (int)(Math.random()*3);
                if (r == 0){
                    total = total + 1;
                }
                else if (r == 1){
                    total = total + 5;
                }
                else if (r == 2){
                    total = total + 10;
                }
            }
            if (total==100){
                count++;
            }
            total = 0;
        }
        System.out.println(count/1000000.0);
    }
}
//answer is 0.187752 or 18.77%
