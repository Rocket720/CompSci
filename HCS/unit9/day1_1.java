package unit9;

public class day1_1 {

    public static void main(String[] args) {

        int rand1 = 0;
        int rand2 = 0;
        double heads = 0;
        double tails = 0;
        double both = 0;
        for (int i = 0; i < 1000000; i++) {
            rand1 = (int)(Math.random()*2);
            rand2 = (int)(Math.random()*2);
            if (rand1==0&&rand2==0){ heads++; }
            else if(rand1==1&&rand2==1){ tails++; }
            else if((rand1==0&&rand2==1)||(rand1==1&&rand2==0)){both++;}
        }
        System.out.println("Both Heads: " + (heads/1000000.0) + " Both Tails: " + (tails/1000000.0) + " 1 of Each: " + (both/1000000.0));

    }

}
