package unit9;

public class day1_2 {

    public static void main(String[] args) {

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int t6s = 0;
        double c = 0;


        for (int i = 0; i < 1000000; i++) {
            d1 = (int)(Math.random()*6);
            d2 = (int)(Math.random()*6);
            d3 = (int)(Math.random()*6);
            d4 = (int)(Math.random()*6);
            if (d1==5){ t6s++; }
            if (d2==5){ t6s++; }
            if (d3==5){ t6s++; }
            if (d4==5){ t6s++; }
            if (t6s==3){ c++; }
            t6s = 0;
        }
        System.out.println("The chance is " + (c/1000000.0));

    }

}
