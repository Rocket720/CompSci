package unit8;

public class day4_3 {

    public static void main(String[] args) {

        for (int i = 999; i < 9999; i++) {
            int a =  i/1000;
            int b = (i%1000)/100;
            int c = ((i%1000)%100)/10;
            int d = (((i%1000)%100)%10);
            int e = (d*1000)+(c*100)+(b*10)+a;

            if (i*4==e){
                System.out.println(i + " and " + e);
                break;
            }
        }
    }
}
