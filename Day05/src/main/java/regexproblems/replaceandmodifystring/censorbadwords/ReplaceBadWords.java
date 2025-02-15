package regexproblems.replaceandmodifystring.censorbadwords;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceBadWords {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("damn");
        set.add("stupid");

        String text = "This is a damn bad example with some stupid words.";

        Pattern pattern = Pattern.compile("\\b\\w+\\b");

        Matcher matcher = pattern.matcher(text);

        String replaced = "";

        while (matcher.find()) {
            if (set.contains(matcher.group())) {
                replaced += "**** ";
            } else {
                replaced += matcher.group();
                replaced += " ";
            }
        }

        System.out.println(replaced);

    }
}
