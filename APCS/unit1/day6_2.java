import java.util.Scanner;
public class day6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(triples(input.nextInt(),input.nextInt()));
    }
    public static boolean triples(int x, int y){
        return (Math.sqrt(x*x + y*y))==(int)(Math.sqrt(x*x + y*y));
    }
    

}