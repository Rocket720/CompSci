package unit8;

public class day5_1 {

    public static void main(String[] args) {

        String hello = "HELLO";
        int x = 0;
        for (int i = 0; i<7;i++)
        {
            for (int j = 0;j<=i;j++)
            {

                System.out.print(hello.charAt(x%hello.length()));

                x++;
            }
            System.out.println();
        }

    }

}
