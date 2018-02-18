package unit9;

public class day2_4 {

    public static void main(String[] args) {
        int s = 0;
        int con = 0;
        double count = 0.0;
        for (int i = 0; i < 1000000; i++) {

            for (int j = 0; j < 3; j++) {

                int r = (int)(Math.random()*6)+1;
                if ((j==1||j==2)&&r==s){
                    con++;
                }
                s = r;
            }
            if (con == 2){
                count++;
            }
            con = 0;
        }
        System.out.println(count/1000000.0);
    }

}
