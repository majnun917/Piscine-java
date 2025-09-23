
import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
    if (args.length != 2) {
        return;
    }
    
    try (FileInputStream fis = new FileInputStream(args[0]); 
         FileOutputStream fos = new FileOutputStream(args[1])) {
        
        int c;
        boolean isFirstCharOfWord = true;
        boolean space = false; 
        
        while ((c = fis.read()) != -1) {
            if (Character.isWhitespace(c)) {
                if (!isFirstCharOfWord) {
                    space = true;
                }
                isFirstCharOfWord = true;
            } else {
                if (space) {
                    fos.write(' ');
                    space = false;
                }
                fos.write(isFirstCharOfWord ? Character.toUpperCase(c) : Character.toLowerCase(c));
                isFirstCharOfWord = false;
            }
        }
    }
}
}
