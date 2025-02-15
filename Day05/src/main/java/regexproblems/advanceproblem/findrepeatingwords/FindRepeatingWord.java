package regexproblems.advanceproblem.findrepeatingwords;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWord {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String text = "This is is a repeated repeated word test.";

        Pattern pattern = Pattern.compile("\\b\\w+\\b");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (set.contains(matcher.group())) {
                System.out.println(matcher.group());
            }
            else {
                set.add(matcher.group());
            }
        }

    }
}
