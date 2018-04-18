package unit11;

public class day1_4 {

    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random()*10);
        }
        int count = 0;
        for (int e : a) {
            if (e==6){
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no sixes");
        }
        else{
            System.out.println("There are " + count + " sixes");
        }
    }

}
