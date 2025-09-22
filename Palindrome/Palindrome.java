public class Palindrome {
    public static boolean isPalindrome(String s) {
        //int l = 0;
        int i = s.length()-1;
        String right = "";
        while (i >=0){
            right += s.charAt(i);
            i--;
        }
        if (s.equals(right)){
            return true;
        }else{
            return false;
        }
    }
}
