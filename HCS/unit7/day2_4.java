package unit7;

import java.util.Scanner;

public class day2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String word = input.next();
        if(a>26){
            System.out.println("bad");
        }
        else{
            if(word.equals("u")){
                for (int i = 65; i < a+1; i++) {
                    System.out.print((char)i+" ");
                }
            }
            else if(word.equals("l")){
                for (int i = 97; i < a+1; i++) {
                    System.out.print((char)i+" ");
                }
            }
        }
    }
}
