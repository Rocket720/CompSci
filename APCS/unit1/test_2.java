public class test_2{

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        scramArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
    public static void scramArray(int[] x){
        for (int i = 0; i < x.length*x.length; i++) {
            int r1 = (int)(Math.random()*x.length);
            int r2 = (int)(Math.random()*x.length);
            int temp = x[r1]; 
            x[r1] = x[r2];
            x[r2] = temp;  
        }
    }
    


}