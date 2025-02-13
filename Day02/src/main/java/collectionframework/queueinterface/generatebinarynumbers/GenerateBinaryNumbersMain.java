package collectionframework.queueinterface.generatebinarynumbers;
import java.util.*;

public class GenerateBinaryNumbersMain {
    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = GenerateBinaryNumbers.generateBinaryNumbers(N);
        System.out.println(binaryNumbers);
    }
}
