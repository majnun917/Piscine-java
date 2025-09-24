
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }

        try (Reader r = new InputStreamReader(new FileInputStream(args[0]), StandardCharsets.UTF_8);
             Writer w = new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8)) {

            int c;
            boolean isFirstCharOfWord = true;
            boolean space = false;
            while ((c = r.read()) != -1) {
                if (Character.isWhitespace(c)) {
                    if (!isFirstCharOfWord) {
                        space = true;
                    }
                    isFirstCharOfWord = true;
                } else {
                    if (space) {
                        w.write(' ');
                        space = false;
                    }
                    w.write(isFirstCharOfWord ? Character.toUpperCase((char) c) : Character.toLowerCase((char) c));
                    isFirstCharOfWord = false;
                }
            }
        }
    }
}
