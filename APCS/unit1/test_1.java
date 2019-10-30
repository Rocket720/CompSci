public class test_1{

    public static void main(String[] args){
        
        System.out.println(whichPrime(5));
    }
    public static int whichPrime(int n){
        int prime = 1;        

        for (int i = 0; i < n; i++) {
            for (int j = prime-1; j > 0; j--) {
                if(prime%j==0)
                    break;
                System.out.println(j);
            }
            prime++;
        }



        return prime;
    }


}