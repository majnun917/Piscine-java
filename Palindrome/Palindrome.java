// package Palindrome;
public class Palindrome {
    public static boolean isPalindrome(String s) {
        // int l = 0;
        if (s == null){
            return false;
        }
        int i = s.length() - 1;
        String right = "";
        while (i >= 0) {
            right += s.toLowerCase().charAt(i);
            // System.out.println("RR: " + right);
            i--;
        }
        s = s.toLowerCase();
        // System.out.println("SS: " + s);
        if (s.equals(right)) {
            return true;
        } else {
            return false;
        }
    }
}
