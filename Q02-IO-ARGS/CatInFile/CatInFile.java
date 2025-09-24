import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
         if (args.length == 0) {
            return;
        }
        try (FileOutputStream fos = new FileOutputStream(args[0])) {
            System.in.transferTo(fos);
        }
    }
}