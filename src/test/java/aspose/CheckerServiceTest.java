package aspose;

import aspose.service.CheckerService;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckerServiceTest {

    @Test
    public void isValidNumberTest() {
        assertTrue(CheckerService.isValidNumber("2"));
        assertFalse(CheckerService.isValidNumber("two"));
        assertTrue(CheckerService.isValidNumber("1"));
        assertTrue(CheckerService.isValidNumber("5"));
        assertTrue(CheckerService.isValidNumber("100"));
        assertFalse(CheckerService.isValidNumber("101"));
        assertFalse(CheckerService.isValidNumber("-1"));
    }

    @Test
    public void isValidInputStringTest() {
        assertTrue(CheckerService.isValidInputString("foo  bar"));
        assertFalse(CheckerService.isValidInputString("Foo bar"));
        assertFalse(CheckerService.isValidInputString("f2 bar"));
    }

    @Test
    public void checkForContainingTest() {
        assertTrue(CheckerService.checkForContaining("44", "444"));
        assertTrue(CheckerService.checkForContaining("444", "44"));
        assertFalse(CheckerService.checkForContaining("999", "33"));
    }
}
