import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClearLogs {
    public static void main(String[] args) {
        String data = new String (getTextFromFile("data"));
        Pattern myRegex = Pattern.compile("([a-zA-Z]{3} +1?[0-9] +[0-2][0-9]:[0-6][0-9]:[0-6][0-9]).*(Activity:).*(\\[Login Username: [^\\]]+\\]).*(\\[Data Object: [^\\]]+\\]).*(\\[Records: [^\\]]+\\]).*(\\[User Action: [^\\]]+\\]).*(\\[User Action Status: [^\\]]+\\]).*(\\[Labels: [^\\]]+\\])?.*(\\[Service type: [^\\]]+\\]).*(\\[Mapping Ids: [^\\]]+\\]).*(\\[URI: [^\\]]+\\])");

        Matcher m = myRegex.matcher(data);
        if (m.find()) {
            System.out.println(m.group(1)+' '+m.group(2)+' '+m.group(3)+' '+m.group(4)+' '+m.group(5)+' '+m.group(6)+' '+m.group(7)+' '+m.group(8)+' '+m.group(9)+' '+m.group(10)+' '+m.group(11));
        } else {
            System.out.println("Maybe error");
        }

    }
//Test

    //getting text from file
    private static String getTextFromFile(String filePath) {
        String content = "";
        try {
            content = new String (Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
