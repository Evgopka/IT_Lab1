import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
    }
    public static String reverseString(String str){
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            ans.insert(0, ch);
        }
        return ans.toString();
    }
    public static boolean isPalindrome(String str1){
        String str2 = reverseString(str1);
        return str1.equals(str2);
    }
}