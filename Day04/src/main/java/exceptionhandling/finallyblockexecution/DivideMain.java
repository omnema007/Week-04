package exceptionhandling.finallyblockexecution;


import java.util.Scanner;

public class DivideMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        Divide.divide(a, b);
    }
}
