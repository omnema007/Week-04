package exceptionhandling.multiplecatchblocks;
import java.util.Scanner;

public class ArrayOperationsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index to get value: ");
        int index = sc.nextInt();


        ArrayOperations.arrayOperations(arr, index);
    }
}
