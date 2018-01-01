package unit6;

import java.util.Scanner;

public class day4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        char c = word.charAt(0);

        if ((int)c>122||(int)c<65||((int)c>90&&(int)c<97)) {
            System.out.println("Invalid Entry");
        }
        else{
            if (c==('a')||c==('A')||c==('e')||c==('E')||c==('i')||c==('I')||c==('o')||c==('O')||c==('u')||c==('U')){
                System.out.println("You entered a vowel dummy");
            }
            //Upper
            else if((int)c>65&&(int)c<69){
                System.out.println("The closest letter to " + c + " is E");
            }
            else if((int)c>69&&(int)c<73){
                System.out.println("The closest letter to " + c + " is I");
            }
            else if((int)c>73&&(int)c<79){
                System.out.println("The closest letter to " + c + " is O");
            }
            else if((int)c>79&&(int)c<85){
                System.out.println("The closest letter to " + c + " is U");
            }
            else if((int)c>85&&(int)c<91){
                System.out.println("There is no vowel after " + c);
            }
            //Lower
            else if((int)c>97&&(int)c<101){
                System.out.println("The closest letter to " + c + " is e");
            }
            else if((int)c>101&&(int)c<105){
                System.out.println("The closest letter to " + c + " is i");
            }
            else if((int)c>105&&(int)c<111){
                System.out.println("The closest letter to " + c + " is o");
            }
            else if((int)c>111&&(int)c<117) {
                System.out.println("The closest letter to " + c + " is u");
            }
            else if((int)c>117&&(int)c<123){
                System.out.println("There is no vowel after " + c);
            }
        }

    }

}
