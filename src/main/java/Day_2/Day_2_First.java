package Day_2;

public class Day_2_First {
    public Integer solution(String input) {
        String[] inputSplitted = input.split("\n");

        Integer result = 0;

        for (int i = 0; i < inputSplitted.length; i++) {
            Integer gameNumber = Integer.valueOf(inputSplitted[i].split(":")[0].replace("Game ", ""));

            String[] sets = inputSplitted[i].replace(("Game " + gameNumber.toString() + ": "), "").split(";");

            Integer redCube = -1;
            Integer blueCube = -1;
            Integer greenCube = -1;

            for (String set : sets) {
                String[] cubes = set.split(",");

                for (String cube : cubes) {
                    if (cube.contains("red")) {
                        Integer redValue = Integer.valueOf(cube.replace(" ","").replace("red", ""));

                        if (redValue > redCube) {
                            redCube = redValue;
                        }
                    }
                    else if (cube.contains("blue")) {
                        Integer blueValue = Integer.valueOf(cube.replace(" ","").replace("blue", ""));

                        if (blueValue > blueCube) {
                            blueCube = blueValue;
                        }

                    }
                    else if (cube.contains("green")) {
                        Integer greenValue = Integer.valueOf(cube.replace(" ","").replace("green", ""));

                        if (greenValue > greenCube) {
                            greenCube = greenValue;
                        }
                    }
                }
            }

            if (redCube <= 12 && blueCube <= 14 && greenCube <= 13) {
                result += gameNumber;
            }
        }


        return result;
    }
}
