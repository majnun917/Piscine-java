import java.io.*;

public class Cat {
    public static void cat(String[] args) {
        if (args.length == 0) {
            return;
        }
        for (String filePath : args) {
            try (FileInputStream fis = new FileInputStream(filePath)) {
                byte[] fileBytes = fis.readAllBytes();
                String fileContent = new String(fileBytes);
                System.out.println(fileContent);
            } catch (IOException e) {
                System.err.println("Erreur");
            }
        }
    }
}