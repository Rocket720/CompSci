package unit11;

public class unitTest11_5 {

    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random()*10);
            b[i] = a[i];
        }
        boolean done = true;
        while(done){
            for (int i = 0; i < 9; i++) {
                if (a[i] > a[i+1]){
                    int mid = a[i];
                    a[i] = a[i+1];
                    a[i+1] = mid;
                }
            }
            int count = 0;
            for (int i = 0; i < 9; i++) {
                if (a[i]>a[i+1]){
                    count++;
                }
            }
            if (count==0){
                done=false;
            }
        }
        int bot = a[0];
        int pos = 0;
        for (int i = 0; i < 10; i++) {
            if (b[i]==bot){
                pos = i;
                break;
            }
        }
        System.out.println("The lowest digit is " + a[0] + " at position " + pos);
        int bot2 = 0;
        int pos2 = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i]>bot){
                bot2 = a[i];
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (b[i]==bot2){
                pos2 = i;
                break;
            }
        }
        System.out.println("The second lowest is " + bot2 + " at position " + pos2);
    }

}
