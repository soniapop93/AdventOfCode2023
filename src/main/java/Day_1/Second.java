package Day_1;

import java.util.ArrayList;
import java.util.Map;

import static java.util.Map.entry;

public class Second {
    public Integer solution(String input) {
        Map<String, String> digitsInLetters = Map.ofEntries(
                entry("1", "one"),
                entry("2", "two"),
                entry("3", "three"),
                entry("4", "four"),
                entry("5", "five"),
                entry("6", "six"),
                entry("7", "seven"),
                entry("8", "eight"),
                entry("9", "nine"));

        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<String> stringValues = new ArrayList<>();

        String[] splittedInput = input.split("\n");

        for (int i = 0; i < splittedInput.length; i++) {
            String digitValue = "";

            // search by digit
            for (int j = 0; j < splittedInput[i].length(); j++) {
                if (splittedInput[i].charAt(j) >= 48 && splittedInput[i].charAt(j) <= 57) {
                    digitValue += splittedInput[i].charAt(j);
                }
                else {
                    //todo: finish it
                }
            }

            // search by word
            for (Map.Entry<String, String> entry : digitsInLetters.entrySet()) {
                if (splittedInput[i].contains(entry.getValue())) {

                }
            }


            stringValues.add(digitValue);
        }
    }
}
