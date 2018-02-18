package unit8;

public class day2_1 {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.print("Line " + i + ": ");
            for (int j = 0; j < 8; j++) {

                for (int k = 0; k < 5; k++) {

                    System.out.print((int)(Math.random()*10));

                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
