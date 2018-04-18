package unit9;

public class day7_2 {

    public static void main(String[] args) {
        int last = 0;
        int streak = 1;
        int longest = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;
        double most = 0.0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 100; j++) {
                int r = (int)(Math.random()*6)+1;
                switch (r){
                    case 1: ones++; case 2: twos++; case 3: threes++; case 4: fours++; case 5: fives++; case 6: sixes++;
                }
            }
            most += Math.max(ones, Math.max(twos, Math.max(threes, Math.max(fours, Math.max(fives, sixes)))));
            ones = 0; twos = 0; threes = 0; fours = 0; fives = 0; sixes = 0;
        }
        System.out.println(most/1000000.0);
    }
}
