    package unit11;

    import java.util.Scanner;

    public class day1_7 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("How many numbers");
            int num = input.nextInt();
            int a[] = new int[num];
            System.out.println("Enter'm");
            for (int i = 0; i < num; i++) {
                a[i]=input.nextInt();
            }
            boolean done = true;
            while (done){
                for (int i = 0; i < num-1; i++) {
                    if (a[i]>a[i+1]){
                        int b = a[i];
                        a[i] = a[i+1];
                        a[i+1] = b;
                    }
                }
                int count = 0;
                for (int i = 0; i < num-1; i++) {
                    if (a[i]>a[i+1]){
                        count++;
                    }
                }
                if (count==0){
                    done = false;
                }
            }
            if (num%2==1){
                System.out.println("The median is " + a[(num/2)]);
            }
            else{
                double med = (a[num/2] + (a[(num/2)-1]))/2;
                System.out.println("The median is " + med);
            }
        }

    }
