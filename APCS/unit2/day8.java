import java.util.Scanner;

public class day8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many MyInts would you like to create?");
        MyInt[] a = {new MyInt((int)(Math.random()*10)),new MyInt((int)(Math.random()*10)),new MyInt((int)(Math.random()*10)),new MyInt((int)(Math.random()*10))};


    }

}

class MyInt {
    int[] factors;// contains all factors
    boolean prime;// self explanatory
    int[] multiples;// contains the first 100 multiples

    MyInt(int x) {
        // x is the integer
        // fill in so that data fields are correct
        factors = factors(x);
        multiples = multiples(x);
        prime = isPrime(x);



    }

    int lcm(MyInt x) {
        int[] a = x.multiples;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(multiples[i]==a[j])
                    return (a[j]);
            }
        }
    }

    int gcf(MyInt x) {
        int[] a = x.factors;
        for (int i = factors.length; i > 0; i--) {
            for (int j = a.length; j > 0; j++) {
                if(factors[i]==a[j])
                    return (a[j]);
            }
        }
    }

    int[] factors(int a){
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

    int[] multiples(int a){
        int[] b = new int[100];
        for (int i = 1; i <= 100; i++) {
            b[i] = a*i;
        }
        return b;
    }

    boolean isPrime(int x){
        int count = 0;
        for (int i = x; i > 1 ; i--) {
            if (((x%i)==0)&&(i!=x)){
                count++;
            }
        }
        if (count==0){
            return true;
        }
        return false;
    }
}
