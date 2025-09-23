import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }
        try (FileInputStream fis = new FileInputStream(args[0]); FileOutputStream fos = new FileOutputStream(args[1])) {
            int c;
            boolean isFirstCharOfWord = true;
            boolean hasWrittenChar = false;
            while ((c = fis.read()) != -1) {
                if (Character.isWhitespace(c)) {
                    if (hasWrittenChar && !isFirstCharOfWord) {
                        fos.write(' ');
                    }
                    isFirstCharOfWord = true;
                } else {
                    fos.write(isFirstCharOfWord ? Character.toUpperCase(c) : Character.toLowerCase(c));
                    isFirstCharOfWord = false;
                    hasWrittenChar = true;
                }
            }
        }
    }
}
