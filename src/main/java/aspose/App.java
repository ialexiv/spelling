package aspose;

import aspose.service.CheckerService;
import aspose.service.TranslateService;

import java.util.Map;
import java.util.Scanner;

public class App {

    private static final String OUTPUT_PREFIX = "Case #";
    private static final String OUTPUT_POSTFIX = ": ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nubmerOfCases = 0;
        String firstLine = in.nextLine();

        if (CheckerService.isValidNumber(firstLine)) {
            nubmerOfCases = Integer.parseInt(firstLine);
        } else {
            System.err.println("First argument must be number");
            System.exit(1);
        }

        String inputLines[] = new String[nubmerOfCases];
        for (int i = 0; i < inputLines.length; i++) {
            inputLines[i] = in.nextLine();
        }
        in.close();

        Map<Integer, String> outputLines = TranslateService.decodeStringArr(inputLines);

        for (Map.Entry<Integer, String> entry : outputLines.entrySet()) {
            System.out.println(OUTPUT_PREFIX + entry.getKey() + OUTPUT_POSTFIX + entry.getValue());
        }
    }


}
