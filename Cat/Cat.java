import java.io.*;

public class Cat {

public static void cat(String[] args) {
    if (args.length == 0) {
        return;
    }
    
    for (String arg : args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arg))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + arg);
        }
    }
}
}