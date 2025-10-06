//import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
     public static String removeUnits(String s) {
        String regex = "(?<=\\d)(?:cm|€)(?=\\s|$)";
        String  replace = "";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(s);

        return match.replaceAll(replace);
    }
    
    public static String obfuscateEmail(String s) {
        String[] parts = s.split("@", 2);
        if (parts.length != 2) return s;
        String user = parts[0];
        String dom = parts[1];



        int i = Math.max(Math.max(user.lastIndexOf('.'), user.lastIndexOf('-')), user.lastIndexOf('_'));
        if (i >= 0 && i <= user.length()) {
            user = user.substring(0, i + 1) + "*".repeat(user.length() - i - 1);
        } else if (user.length() > 3) {
            user = user.substring(0, 3) + "*".repeat(user.length() - 3);
        }

     
        String[] splDom = dom.split("\\.");
        splDom[0] = "*".repeat(splDom[0].length());
        if (splDom.length == 3) {
            splDom[2] = "*".repeat(splDom[2].length());
        } else {
            String tlDom = splDom[1];
            if (!(tlDom.equals("com") || tlDom.equals("org") || tlDom.equals("net"))) {
                splDom[1] = "*".repeat(splDom[1].length());
            }
        }
        return user + "@" + String.join(".", splDom);
    }

    //     public static void main(String[] args) throws IOException {
    //     System.out.println(RegexReplace.removeUnits("32cm et 50€"));
    //     System.out.println(RegexReplace.removeUnits("32 cm et 50 €"));
    //     System.out.println(RegexReplace.removeUnits("32cms et 50€!"));
        
    //     System.out.println(RegexReplace.obfuscateEmail("john.doe@example.com"));
    //     System.out.println(RegexReplace.obfuscateEmail("jann@example.co.org"));
    //     System.out.println(RegexReplace.obfuscateEmail("jackob@example.fr"));
    // }

}

