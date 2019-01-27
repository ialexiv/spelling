package aspose.service;

import aspose.Dictionary;

import java.util.LinkedHashMap;
import java.util.Map;

public class TranslateService {

    private static final String DUMMY_STRING = "DUMMY";

    public static String getNumberByCharacter(String targetChar) {
        return Dictionary.charToDigitMap.get(targetChar);
    }

    public static Map<Integer, String> decodeStringArr(String[] inputLines) {
        int index = 0;
        Map<Integer, String> outputLines = new LinkedHashMap<>();
        for (String inputLine : inputLines) {
            index++;
            if (CheckerService.isValidInputString(inputLine)) {
                char[] charArray = inputLine.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();
                String previousCombination = DUMMY_STRING;
                for (char c : charArray) {
                    String decodedStringByChar = TranslateService.getNumberByCharacter(String.valueOf(c));
                    if (CheckerService.checkForContaining(previousCombination, decodedStringByChar)) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append(decodedStringByChar);
                    previousCombination = decodedStringByChar;
                }
                outputLines.put(index, stringBuilder.toString());
            } else {
                //System.err.println("Each message will consist of only lowercase characters a-z and space characters ' '");
                outputLines.put(index, "ERROR in input string. Each message will consist of only lowercase characters a-z and space characters ' '");
            }
        }
        return outputLines;
    }
}
