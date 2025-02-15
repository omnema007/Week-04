package regexproblems.extractionproblems.extractemailaddress;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{3}");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
