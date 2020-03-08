package test.com.paulisaris.codekatas.bracketsvalidator;

import main.com.paulisaris.codekatas.bracketsvalidator.BracketsValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsValidatorTest {

    @Test
    public void testBracketsValidator() {
        BracketsValidator bracketsValidator = new BracketsValidator();

        assertTrue(bracketsValidator.validate("{ [ ] ( ) }"));
        assertFalse(bracketsValidator.validate(("{ [ ( ] ) }")));
        assertFalse(bracketsValidator.validate(("{ [ }")));
    }

}
