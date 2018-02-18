package unit9;

public class day1_4 {

    public static void main(String[] args) {

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int t5s = 0;
        double c = 0;
        int odd = 0;

        for (int i = 0; i < 1000000; i++) {
            d1 = (int)(Math.random()*6);
            d2 = (int)(Math.random()*6);
            d3 = (int)(Math.random()*6);
            d4 = (int)(Math.random()*6);
            d5 = (int)(Math.random()*6);
            if (d1==4){ t5s++; }
            if (d2==4){ t5s++; }
            if (d3==4){ t5s++; }
            if (d4==4){ t5s++; }
            if (d5==4){ t5s++; }
            if (t5s>=3){ c++; }
            t5s = 0;
            if (d1!=0&&d2!=0&&d3!=0&&d4!=0&&d5!=0){ odd++; }
        }
        System.out.println("The chance of at least 3 5s is " + (c/1000000.0));
        System.out.println("The chance of all odds is " + (odd/1000000.0));
        if (odd>c){
            System.out.println("Odds have a greater chance");
        }
        else if (odd<c){
            System.out.println("3 5s has a greater chance");
        }
    }

}
