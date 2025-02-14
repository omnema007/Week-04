package exceptionhandling.multiplecatchblocks;

public class ArrayOperations {
    public static void arrayOperations(int[] arr, int index) {

        try {
            if (arr.length == 0) {
                throw new NullPointerException("Array is not initialized!");
            }

            int value = arr[index];
            System.out.println("Value at index " + index + " is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
