package regexproblems.basicregexproblem.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hex Color Code: ");
        String licensePlateNumber = sc.next();

        Pattern pattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");

        Matcher matcher = pattern.matcher(licensePlateNumber);

        if (matcher.matches()) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }
    }
}
