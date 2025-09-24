
import java.io.*;

public class FileSearch {

    public static String searchFile(String fileName) {
        File documentsFolder = new File("documents");
        //System.out.println(documentsFolder.getAbsolutePath()); 
        return searchInDirectory(documentsFolder, fileName);
    }

    private static String searchInDirectory(File directory, String fileName) {
        if (!directory.exists() || !directory.isDirectory()) {
            return null;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            return null;
        }

        for (File file : files) {
            if (file.isFile() && fileName.equalsIgnoreCase(file.getName())) {
                return file.getAbsolutePath();
            } else if (file.isDirectory()) {
                String result = searchInDirectory(file, fileName);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
}
