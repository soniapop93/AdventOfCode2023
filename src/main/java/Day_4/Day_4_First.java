package Day_4;

import java.util.Arrays;

public class Day_4_First {
    public Integer solution(String input) {
        int result = 0;

        input = input.replace("  ", " ");
        String[] splittedInput = input.split("\n");

        for (int i = 0; i < splittedInput.length; i++){
            String[] numbersSplitted = splittedInput[i].split(":")[1].trim().split("\\|");

            String[] winningNumbers = numbersSplitted[0].split(" ");
            String[] myNumbers = numbersSplitted[1].split(" ");

            int winningPoints = 0;

            for (int j = 0; j < myNumbers.length; j++) {
                if (Arrays.asList(winningNumbers).contains(myNumbers[j])) {
                    winningPoints++;
                }
            }

            int points = 0;

            if (winningPoints >= 1) {
                winningPoints--;
                points = 1;
            }
            while (winningPoints > 0) {
                points *= 2;

                winningPoints--;
            }

            result += points;
        }

        return result;
    }
}
