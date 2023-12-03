package Day_1;

import java.util.ArrayList;
import java.util.Map;

import static java.util.Map.entry;

public class Day_1_Second {
    public Integer solution(String input) {
        Map<String, String> digitsInLetters = Map.ofEntries(
                entry("o1e", "one"),
                entry("t2o", "two"),
                entry("th3e", "three"),
                entry("4", "four"),
                entry("5e", "five"),
                entry("6", "six"),
                entry("7n", "seven"),
                entry("e8t", "eight"),
                entry("n9e", "nine"));

        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<String> stringValues = new ArrayList<>();

        String[] splittedInput = input.split("\n");
        String[] test = input.split("\n");

        for (int i = 0; i < splittedInput.length; i++) {
            String replaced = replaceDigits(splittedInput[i], digitsInLetters);
            if (replaced != null) {
                splittedInput[i] = replaced;
            }
        }

        for (int i = 0; i < splittedInput.length; i++) {
            String digitValue = "";

            for (int j = 0; j < splittedInput[i].length(); j++) {
                if (splittedInput[i].charAt(j) >= 48 && splittedInput[i].charAt(j) <= 57) {
                    digitValue += splittedInput[i].charAt(j);
                }
            }

            stringValues.add(digitValue);
        }

        for (int i = 0; i < stringValues.size(); i++) {
            int lenValue = stringValues.get(i).length();

            if (lenValue == 1) {
                values.add(Integer.parseInt(stringValues.get(i) + stringValues.get(i)));
            }

            else if (lenValue == 2){
                values.add(Integer.parseInt(stringValues.get(i)));
            }
            else {
                values.add(Integer.parseInt(String.valueOf(stringValues.get(i).charAt(0)) + String.valueOf(stringValues.get(i).charAt(lenValue - 1))));
            }
        }

        Integer sumValues = 0;


        for (Integer value : values) {
            sumValues += value;
        }

        return sumValues;
    }

    private String replaceDigits(String input, Map<String, String> digitsInLetters) {
        boolean found = false;
        boolean replaced = false;

        for (int i = 0; i < input.length(); i++) {
            for (Map.Entry<String, String> entry : digitsInLetters.entrySet()) {
                if (input.charAt(i) == entry.getValue().charAt(0)) {
                    if (foundDigitForward(input, i, entry.getValue())) {
                        input = input.replaceFirst(entry.getValue(), entry.getKey());
                        found = true;
                        replaced = true;
                        break;
                    }
                }
            }
            if (found)
                break;
        }

        found = false;
        for (int i = input.length() - 1; i >= 0; i--) {
            for (Map.Entry<String, String> entry : digitsInLetters.entrySet()) {
                if (input.charAt(i) == entry.getValue().charAt(entry.getValue().length() - 1)) {
                    if (foundDigitBackwards(input, i, entry.getValue())) {
                        input = input.substring(0, i - entry.getValue().length() + 1) + entry.getKey() + input.substring(i + 1);
                        found = true;
                        replaced = true;
                        break;
                    }
                }
            }
            if (found)
                break;
        }

        if (replaced)
            return input;

        return null;
    }

    private boolean foundDigitForward(String input, int index, String searchedDigit) {
        for (int i = 0; i < searchedDigit.length(); i++) {
            if ((index + i) > input.length() - 1) {
                return false;
            }

            if (input.charAt(index + i) != searchedDigit.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean foundDigitBackwards(String input, int index, String searchedDigit) {
        for (int i = searchedDigit.length() - 1; i >= 0; i--) {
            if ((index - i) < 0) {
                return false;
            }

            if (input.charAt(index - (searchedDigit.length() - 1 - i)) != searchedDigit.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
