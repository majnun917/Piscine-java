// package student.RegexMatch;

import java.io.IOException;
import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        if (s == null) return false;
        return Pattern.matches("[a-zA-Z]*", s);
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        if (s == null) return false;
       return Pattern.matches("^[a-zA-Z].*[0-9]$", s);
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
        if (s == null) return false;
        return Pattern.matches(".*A{3,}.*", s);
    }

    // public static void main(String[] args) throws IOException {
    //     System.out.println(RegexMatch.containsOnlyAlpha(null));
    //     System.out.println(RegexMatch.containsOnlyAlpha("azejkd fhjsdf"));
    //     System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6f5"));
    //     System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6."));
    //     System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAAAAsdjksj"));
    //     System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAsdaaasdjksj"));
    // }
}
