package unit9;

public class day6_4 {

    public static void main(String[] args) {
        double count = 0.0;
        int people = 0;
        for (int i = 0; i < 1000000; i++) {
            int bday = (int)(Math.random()*365)+1;
            for (int j = 0; j < 40; j++) {
                int r = (int)(Math.random()*365)+1;
                if (r == bday){
                    people++;
                }
            }
            if (people>=2){
                count++;
                people = 0;
            }
        }
        System.out.println(count/10000000.0);
    }

}
