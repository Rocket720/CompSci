public class test_3{

    public static void main(String[] args){
        System.out.println(isAPalindrome("racecar"));
        System.out.println(isAPalindrome("fuck"));
        System.out.println(isAPalindrome("asdfdsa"));
    }
    public static boolean isAPalindrome(String word){
        String drow = "";
        for (int i = word.length()-1; i >= 0; i--) {
            drow+=word.charAt(i);
        }
        return word.equals(drow);
    }
    


}