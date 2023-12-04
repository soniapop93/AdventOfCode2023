package Day_4;

import java.util.Arrays;

public class Day_4_First {
    public Integer solution(String input) {
        Integer result = 0;

        String[] splittedInput = input.split("\n");

        for (int i = 0; i < splittedInput.length; i++){
            String[] numbersSplitted = splittedInput[i].split(":")[1].trim().split("|");

            String[] winningNumbers = numbersSplitted[0].split(" ");
            String[] myNumbers = numbersSplitted[1].split(" ");

            Integer points = 0;

            for (int j = 0; j < myNumbers.length; j++) {
                if (Arrays.asList(winningNumbers).contains(myNumbers[j])) {
                    //todo: finish it
                }
            }
        }

        return result;
    }
}
