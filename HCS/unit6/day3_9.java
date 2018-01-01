package unit6;

public class day3_9 {

    public static void main(String[] args) {

        double rand = Math.random();

        if (rand>0.5){
            System.out.println((char)(26 *Math.random()+65));
            System.out.println((char)(26 *Math.random()+97));
        }
        else if (rand<0.5){
            System.out.println((char)(26 *Math.random()+97));
            System.out.println((char)(26 *Math.random()+65));
        }


    }

}
