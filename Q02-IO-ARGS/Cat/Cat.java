import java.io.*;

public class Cat {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        for (String filename : args) {
            try (FileInputStream fis = new FileInputStream(filename)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    System.out.write(buffer, 0, bytesRead);
                }
            }
        }
    }
}
