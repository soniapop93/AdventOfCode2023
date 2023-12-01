package Day_1;

import java.util.ArrayList;

public class Day_1_First {
    public Integer solution(String input) {
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<String> stringValues = new ArrayList<>();

        String[] splittedInput = input.split("\n");

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
}
