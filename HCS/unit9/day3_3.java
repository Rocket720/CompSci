package unit9;

public class day3_3 {

    public static void main(String[] args) {

        int a1, a2, a3, d1, d2;
        int a = 0;
        int d = 0;
        double attacker = 0.0;
        double defender = 0.0;
        double both = 0.0;
        for (int i = 0; i < 1000000; i++) {

            a1 = (int)(Math.random()*6)+1;
            a2 = (int)(Math.random()*6)+1;
            a3 = (int)(Math.random()*6)+1;
            d1 = (int)(Math.random()*6)+1;
            d2 = (int)(Math.random()*6)+1;

            int aH = Math.max(a1, Math.max(a2, a3));
            int aL = Math.min(a1, Math.min(a2, a3));
            int aM = a1+a2+a3-aH-aL;
            int dH = Math.max(d1, d2);
            int dL = Math.min(d1, d2);

            if (aH>dH){
                a++;
            }
            else if (aH<dH){
                d++;
            }
            if (aM>dL){
                a++;
            }
            else if (aM<dL){
                d++;
            }

            if (a==2){
                attacker++;
            }
            else if (d==2){
                defender++;
            }
            else if (a==1&&d==1){
                both++;
            }
            a = 0;
            d = 0;
        }
        System.out.println("Attacker: " + attacker/1000000 + " Defender: " + defender/1000000 + " Both: " + both/1000000);
    }

}
