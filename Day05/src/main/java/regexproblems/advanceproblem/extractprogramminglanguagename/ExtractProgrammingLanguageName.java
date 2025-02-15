package regexproblems.advanceproblem.extractprogramminglanguagename;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageName {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("Go");

        Pattern pattern = Pattern.compile("\\b\\w+\\b");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (set.contains(matcher.group())) {
                System.out.println(matcher.group());
            }
        }

    }
}
