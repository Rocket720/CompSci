package unit10;

public class unitTest10_5 {

    public static void main(String[] args) {
        int[] a = new int[5];
        int total = 0;
        for (int i = 10000; i < 100000; i++) {
            a[0]=i/10000;
            a[1]=(i/1000)%10;
            a[2]=(i/100)%10;
            a[3]=(i/10)%10;
            a[4]=i%10;
            if (a[0]==a[4]&&a[1]==a[3]){
                System.out.println(i);
                total++;
            }
        }

        System.out.println("There are " + total + " palindromes from 10,000 to 99,999");
        //outputs "There are 900 palindromes from 10,000 to 99,999"
    }

}
