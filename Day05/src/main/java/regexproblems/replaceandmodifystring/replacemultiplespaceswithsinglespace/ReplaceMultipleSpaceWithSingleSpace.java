package regexproblems.replaceandmodifystring.replacemultiplespaceswithsinglespace;

import java.util.regex.*;

public class ReplaceMultipleSpaceWithSingleSpace {
    public static void main(String[] args) {
        String text = "This   is  an     example  with  multiple    spaces.";

        String str = text.replaceAll("\\s+", " ");

        System.out.println("Before Replace: " + text);
        System.out.println("After Replace: " + str);




    }
}
