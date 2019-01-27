package aspose;

import aspose.service.TranslateService;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertTrue;

public class TranslateServiceTest {

    @Test
    public void decodeStringArrTest() {
        String[] inputArr = {"hi", "yes", "foo  bar", "hello world"};
        Map<Integer, String> result = TranslateService.decodeStringArr(inputArr);
        assertTrue(result.get(1).equals("44 444"));
        assertTrue(result.get(2).equals("999337777"));
        assertTrue(result.get(3).equals("333666 6660 022 2777"));
        assertTrue(result.get(4).equals("4433555 555666096667775553"));
    }
}
