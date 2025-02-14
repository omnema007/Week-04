package exceptionhandling.checkedexception;

public class FileReaderMain {
    public static void main(String[] args) {
        String fileName = "data.txt";

        System.out.println(FileReader.fileReader(fileName));
    }
}
