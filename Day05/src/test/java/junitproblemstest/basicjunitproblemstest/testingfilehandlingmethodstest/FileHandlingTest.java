package junitproblemstest.basicjunitproblemstest.testingfilehandlingmethodstest;
import junitproblems.basicjunitproblems.testingfilehandlingmethods.FileHandling;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
public class FileHandlingTest {
    @Test
    public void testWriteAndReadFile() throws IOException {
        String filename = "testfile.txt";
        String content = "Hello, File!";
        FileHandling.writeToFile(filename, content);
        assertEquals(content, FileHandling.readFromFile(filename));
    }

    @Test
    public void testFileExistsAfterWrite() throws IOException {
        String filename = "testfile.txt";
        FileHandling.writeToFile(filename, "Sample Content");
        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    public void testIOExceptionForNonExistentFile() {
        assertThrows(IOException.class, () -> FileHandling.readFromFile("nonexistent.txt"));
    }
}
