package exceptionhandling.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array index: ");
        int index = sc.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = sc.nextInt();

        NestedTryCatch.performOperation(arr, index, divisor);
    }
}
