package unit9;

public class day4_2{
    public static void main(String[] args){
        double count = 0.0;
        for (int i = 0; i < 1000000; i++){

            int c1 = (int)(Math.random()*7+1);
            int c2 = (int)(Math.random()*7+1);
            while (c1==c2){
                c2 = (int)(Math.random()*7+1);
            }
            if (c1%2!=c2%2)
                count++;
        }
        System.out.println(count/1000000.0);
    }
}
