package unit1;

public class fraction {

    public static void main(String[] args) {

        System.out.println(toFraction(.1266));

    }

    public static String toFraction(double x) {
        double y = x;
        while((double)(int)y!=y){
            y*=10;
        }
        double factor = y/x;

        int a=(int)y; int b =(int)factor;
        System.out.println(a + " " + b);
        for (int i = 2; i < a; i++) {
            if (a%i==0){
                a/=i;
                b/=i;
                i=1;
            }
        }

        return a + "/" + b;
    }

}
