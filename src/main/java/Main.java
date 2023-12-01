import Day_1.Day_1_First;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String inputTest = readFile("Inputs\\InputTest.txt");
        String input = readFile("Inputs\\Input.txt");

        // Day 1
        Day_1_First day1First = new Day_1_First();
        System.out.println(day1First.solution(inputTest));
        System.out.println(day1First.solution(input));
    }

    private static String readFile(String file) {
        String input = "";
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                input += line + "\n";
                line = reader.readLine();
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return input;
    }
}