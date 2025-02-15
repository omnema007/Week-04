package regexproblems.basicregexproblem.validateusername;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        String userName = sc.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");

        Matcher matcher = pattern.matcher(userName);

        if (matcher.matches()) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username!");
        }


    }
}
