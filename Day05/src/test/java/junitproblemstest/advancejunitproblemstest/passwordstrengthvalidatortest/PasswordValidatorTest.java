package junitproblemstest.advancejunitproblemstest.passwordstrengthvalidatortest;
import junitproblems.advancejunitproblems.passwordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PasswordValidatorTest {
    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Secure123"));
        assertTrue(PasswordValidator.isValid("Passw0rd!"));
    }

    @Test
    public void testInvalidPasswordLength() {
        assertFalse(PasswordValidator.isValid("Short1"));
    }

    @Test
    public void testInvalidPasswordNoUppercase() {
        assertFalse(PasswordValidator.isValid("password123"));
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        assertFalse(PasswordValidator.isValid("Password!"));
    }
}
