package exceptionhandling.trywithresources;
import java.io.*;

public class FileRead {
    public static void readFirstLine(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
