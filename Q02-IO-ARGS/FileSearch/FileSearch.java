
import java.io.*;

public class FileSearch {

    public static String searchFile(String fileName) {
        File documentsFolder = new File("documents");
        //System.out.println(documentsFolder.getAbsolutePath()); 
        return searchInDirectory(documentsFolder, fileName, "documents");
    }

    private static String searchInDirectory(File directory, String fileName, String currPath) {
        if (!directory.exists() || !directory.isDirectory()) {
            return null;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            return null;
        }

        for (File file : files) {
            if (file.isFile() && fileName.equalsIgnoreCase(file.getName())) { 
                return currPath + "/" + file.getName();
            } else if (file.isDirectory()) {
                String result = searchInDirectory(file, fileName, currPath + "/" + file.getName());
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
    //  public static void main(String[] args) throws IOException {
    //     System.out.println(FileSearch.searchFile("input"));
    // }
}
