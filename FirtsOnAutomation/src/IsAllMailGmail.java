import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class IsAllMailGmail {
    public static void main(String[] args) {
        String data = new String (getTextFromFile("data"));
        for (String mail : data.split(",|;"))
            System.out.println(isAllGmail(mail));
    }

    // check if every e-mail is @gmail:
    //*The first character of your username should be a letter (a-z) or number +
    //*Please use only letters (a-z), numbers, and periods +
    //*Please use between 6 and 30 characters -
    public static boolean isAllGmail(String text) {
//        String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*)@gmail\.com,?";// for any gmail.com
        String regex = "^ ?[-a-z0-9]+(\\.[-a-z0-9]+)*@gmail\\.com";// only for requar from gmail.com
        return Pattern.compile(regex).matcher(text).find();
    }

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
