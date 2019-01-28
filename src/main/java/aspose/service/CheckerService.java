package aspose.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckerService {

    private static final String inputStringRegex = "[a-z\\s]+";

    public static boolean isValidNumber(String lineToCheck) {
        Integer intValue;
        try {
            intValue = Integer.parseInt(lineToCheck);
        } catch (NumberFormatException e) {
            return false;
        }
        if (intValue < 1 || intValue > 100) {
            return false;
        }
        return true;
    }

    public static boolean isValidInputString(String inputString) {
        Pattern pattern = Pattern.compile(inputStringRegex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }

    public static boolean checkForContaining(String oneString, String otherString) {
        return oneString.contains(otherString) || otherString.contains(oneString);
    }
}
