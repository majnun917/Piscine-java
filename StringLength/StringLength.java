package StringLength;

public class StringLength {
     public static int getStringLength(String s) {
        if (s == null){
            return 0;
        }
        int str_len = 0;
        while (str_len <  s.length()) {
            str_len ++;
        }
        return str_len;
    }
}
