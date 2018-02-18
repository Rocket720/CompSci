package unit8;

public class day6_2 {

    public static void main(String[] args) {
        System.out.println("OOOOO");
        int pos = 5;
        for (int i = 0; i < 240; i++) {
            while(System.currentTimeMillis()%250!=0){}
            double rand = Math.random();

            if (rand<0.5){pos--;}
            else if (rand>0.5){pos++;}

            if (pos<1){pos = 2;}
            if (pos>10){pos = 9;}

            for (int j = 0; j < pos; j++) {
                System.out.print("O");
            }
            System.out.println();
        }

    }
}

//Why did the can crusher quit his job

//it was soda pressing