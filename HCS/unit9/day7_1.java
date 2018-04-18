package unit9;

public class day7_1 {

    public static void main(String[] args) {
        int last = 0;
        int streak = 1;
        int longest = 0;
        double total = 0.0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 100; j++) {
                int r = (int)(Math.random()*6)+1;
                if (last == r){
                    streak++;
                }
                else{
                    if (longest<streak){
                        longest = streak;
                    }
                    streak = 1;
                }
                last = r;
            }
            total+=longest;
        }
        System.out.println(total/1000000.0);
    }

}
