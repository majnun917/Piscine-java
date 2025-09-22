public class StringReplace {
    public static String replace(String s, Object target, Object replacement) {
        if (s == null || target == null || replacement == null){
            return null;
        }
        return s.replaceAll(target.toString(), replacement.toString());
    }
}
