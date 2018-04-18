package unit9;

public class day6_3 {

    public static void main(String[] args){
        double total = 0;
        boolean works = false;
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 400; k++) {
                    if ((i*15) + j + (k*0.25) == 100.00 && i + j + k == 100&&(i>=1&&j>=1&&k>=1)) {
                        works = true;
                        a = i;
                        b = j;
                        c = k;
                        break;
                    }
                }
                if (works) {
                    break;
                }
            }
            if (works) {
                System.out.println(a + " dogs " + b + " cats " + c + " mice");
                works=false;
            }
        }
    }
}
