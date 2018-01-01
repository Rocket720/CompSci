package unit6;

import java.util.Scanner;

public class day5_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.next();
        String word = line.substring(0, 3);

        int let = 0;
        int dig = 0;

        //char 0
        if(((int)word.charAt(0)>64&&(int)word.charAt(0)<91)^((int)word.charAt(0)>96&&(int)word.charAt(0)<123)){
            let++;
        }
        else if(((int)word.charAt(0)>47&&(int)word.charAt(0)<58)){
            dig++;
        }
        //char 1
        if(((int)word.charAt(1)>64&&(int)word.charAt(1)<91)^((int)word.charAt(1)>96&&(int)word.charAt(1)<123)){
            let++;
        }
        else if(((int)word.charAt(1)>47&&(int)word.charAt(1)<58)){
            dig++;
        }
        //char 2
        if(((int)word.charAt(2)>64&&(int)word.charAt(2)<91)^((int)word.charAt(2)>96&&(int)word.charAt(2)<123)){
            let++;
        }
        else if(((int)word.charAt(2)>47&&(int)word.charAt(2)<58)){
            dig++;
        }

        if((dig==1)&&(let==1)){System.out.println("There is " + dig + " digit and " + let + " letter");}
        else if((dig==1)&&(let!=1)){System.out.println("There is " + dig + " digit and " + let + " letters");}
        else if((dig!=1)&&(let==1)){System.out.println("There are " + dig + " digits and " + let + " letter");}
        else if((dig!=1)&&(let!=1)){System.out.println("There are " + dig + " digits and " + let + " letters");}
    }

}
