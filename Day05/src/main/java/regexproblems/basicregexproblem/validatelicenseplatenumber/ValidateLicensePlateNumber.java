package regexproblems.basicregexproblem.validatelicenseplatenumber;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter License Plate Number: ");
        String licensePlateNumber = sc.next();

        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$");

        Matcher matcher = pattern.matcher(licensePlateNumber);

        if (matcher.matches()) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }
    }
}
