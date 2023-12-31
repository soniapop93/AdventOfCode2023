import Day_1.Day_1_First;
import Day_1.Day_1_Second;
import Day_2.Day_2_First;
import Day_2.Day_2_Second;
import Day_4.Day_4_First;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String inputTest = readFile("Inputs\\InputTest.txt");
        String input = readFile("Inputs\\Input.txt");

        // Day 1
//        Day_1_First day1First = new Day_1_First();
//        System.out.println(day1First.solution(inputTest));
//        System.out.println(day1First.solution(input));
//
//        Day_1_Second day1Second = new Day_1_Second();
//        System.out.println(day1Second.solution(inputTest));
//        System.out.println(day1Second.solution(input));
//
//        // Day 2
//        Day_2_First day2First = new Day_2_First();
//        System.out.println(day2First.solution(inputTest));
//        System.out.println(day2First.solution(input));
//
//        Day_2_Second day2Second = new Day_2_Second();
//        System.out.println(day2Second.solution(inputTest));
//        System.out.println(day2Second.solution(input));
//
        // Day 4
        Day_4_First day4First = new Day_4_First();
        System.out.println(day4First.solution(inputTest));
        System.out.println(day4First.solution(input));
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