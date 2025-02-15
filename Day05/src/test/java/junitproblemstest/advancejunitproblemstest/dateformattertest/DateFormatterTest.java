package junitproblemstest.advancejunitproblemstest.dateformattertest;
import junitproblems.advancejunitproblems.dateformatter.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatterTest {
    @Test
    public void testValidDateFormat() throws ParseException {
        assertEquals("25-12-2024", DateFormatter.formatDate("2024-12-25"));
        assertEquals("01-01-2025", DateFormatter.formatDate("2025-01-01"));
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("25-12-2024"));
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("2024/12/25"));
    }
}
