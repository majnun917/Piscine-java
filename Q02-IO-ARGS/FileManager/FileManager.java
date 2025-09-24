
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
       try {
           Files.write(Paths.get(fileName), content.getBytes());
       } catch (IOException e) {
           e.getStackTrace();
       }
    }
    public static String getContentFile(String fileName) throws IOException {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.getStackTrace();
        }
        return null;
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}
