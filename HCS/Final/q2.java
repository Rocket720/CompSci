package Final;

public class q2 {

    public static void main(String[] args) {
        int  a = 1;
        System.out.println("X");
        for (int i = 0; i < 99; i++) {
            int r = (int)(Math.random()*2);
            if (r==0){
                a--;
            }
            else if (r==1){
                a++;
            }

            if (a==0){
                a = 2;
            }
            else if(a==9){
                a = 7;
            }
            for (int j = 0; j < a; j++) {
                System.out.print("X");
            }
            System.out.println();

        }

    }

}
