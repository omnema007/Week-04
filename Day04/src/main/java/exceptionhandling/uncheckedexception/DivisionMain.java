package exceptionhandling.uncheckedexception;

import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        Division.division(a, b);
    }
}
