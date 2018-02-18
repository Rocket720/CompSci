package unit9;

public class day1_3 {

    public static void main(String[] args) {

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int a7 = 0;

        for (int i = 0; i < 1000000; i++) {
            d1 = (int)(Math.random()*6)+1;
            d2 = (int)(Math.random()*6)+1;
            d3 = (int)(Math.random()*6)+1;
            if (d1+d2+d3==7){ a7++; }
        }
        System.out.println("The chance is " + (a7/1000000.0));

    }

}
