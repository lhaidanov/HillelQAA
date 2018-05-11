import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class SelectLogsWithActions {
    public static File folder = new File("C:\\Users\\lhaidanov\\Downloads\\Logs");
    static String temp = "";

    public static void main(String[] args) {
        System.out.println("Reading files under the folder "+ folder.getAbsolutePath());
        listFilesForFolder(folder);
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                if (fileEntry.isFile()) {
                    temp = fileEntry.getName();
                    System.out.println("File= " + folder.getAbsolutePath()+ "\\" + fileEntry.getName());
                }

            }
        }
    }

    private static String getTextFromFile(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static boolean isServerNumb(String text) {
        String regex = ".";
        return Pattern.compile(regex).matcher(text).find();
    }

    public void TextToFile()
            throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lhaidanov\\Downloads\\Logs\\allLogs.txt"));
        writer.write(str);

        writer.close();
    }
}