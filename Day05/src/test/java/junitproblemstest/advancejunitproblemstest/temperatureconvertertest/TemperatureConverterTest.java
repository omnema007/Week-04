package junitproblemstest.advancejunitproblemstest.temperatureconvertertest;
import junitproblems.advancejunitproblems.temperatureconverter.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TemperatureConverterTest {
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100));
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.1);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212));
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.1);
    }
}
