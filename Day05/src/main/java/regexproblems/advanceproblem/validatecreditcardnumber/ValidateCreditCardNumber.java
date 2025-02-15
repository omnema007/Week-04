package regexproblems.advanceproblem.validatecreditcardnumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter credit card number: ");
        String cardNumber = sc.next();
        String regex = "^4[0-9]{15}$|^5[0-9]{15}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(cardNumber);

        if (matcher.matches()) {
            if (cardNumber.startsWith("4")) {
                System.out.println("Visa Credit Card");
            }
            else if (cardNumber.startsWith("5")) {
                System.out.println("Master Credit Card");
            }
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }
}
