package unit8;

public class day6_1 {

    public static void main(String[] args) {

        for (int i = 1; i < (int)(Math.random()*41); i++) {
            System.out.print("Line " + i + ": ");
            for (int j = 0; j < (int)(Math.random()*51); j++) {
                System.out.print((int)(Math.random()*11));
            }
            System.out.println();
        }

    }

}
