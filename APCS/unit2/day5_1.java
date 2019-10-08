public class day5_1 {

    public static void main(String[] args){
        System.out.println(MathX.round(15.12345, 3));   
    }

}

class MathX {

    static double abs(double x) {
        if(x>0)
            return x;
        return -1*x;
    }

    static double exp(double a, int b) {
        double c = a;
        for (int i = 0; i < b; i++) {
            c*=a;
        }
        return c;
    }

    static int nearPerfect(int a) {
        int[] b = factors(a);
        if(b.length%2==1){
            return a;
        }
        if(Math.pow(a-b[b.length],2)<Math.pow(a-b[b.length-1],2))
            return(b[b.length]);
        return(b[b.length-1]);
    }

    static int[] factors(int a){
        int len = 0;
        for (int i = 0; i <= a; i++) {
            if(a%i==0)
                len++;
        }
        int[] b = new int[len];
        int c = 0;
        for (int i = 0; i <= a; i++) {
            if(a%i==0) 
                c++;
                b[c] = i;
        }
        return b;
    }

    static double round(double a, int b) {
        double c = (int)(a * Math.pow(10, b));
        return(c/=Math.pow(10, b));
    }

}