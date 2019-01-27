package aspose;

import aspose.service.TranslateService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void simpleMappingDictionaryTest() {
        assertTrue(TranslateService.getNumberByCharacter("d").equals("3"));
        assertTrue(TranslateService.getNumberByCharacter("u").equals("88"));
        assertTrue(TranslateService.getNumberByCharacter("z").equals("9999"));
        assertTrue(TranslateService.getNumberByCharacter("w").equals("9"));
        assertTrue(TranslateService.getNumberByCharacter("c").equals("222"));
        assertTrue(TranslateService.getNumberByCharacter("a").equals("2"));
        assertTrue(TranslateService.getNumberByCharacter("t").equals("8"));
        assertTrue(TranslateService.getNumberByCharacter(" ").equals("0"));
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionTest() {
        TranslateService.getNumberByCharacter("T").equals("3");
    }
}
