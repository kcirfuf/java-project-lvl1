package hexlet.code;

import java.util.Arrays;

public final class Progression implements Game {
    private static final byte PROGRESSION_ELEMENTS_COUNT = 10;
    private static final String CONDITION = "What number is missing in the progression?";

    public String run() {
        int firstNumber = Engine.generateRandomNumber();
        int step = Engine.generateRandomNumber();
        int randomElement =  Engine.generateRandomNumber(0, 9);
        int[] progression = generateProgression(firstNumber, step, PROGRESSION_ELEMENTS_COUNT);
        String question = generateQuestion(progression, randomElement);
        System.out.println(question);
        return String.valueOf(progression[randomElement]);
    }

    private int[] generateProgression(int firstNumber, int step, int countOfElements) {
        int[] progression = new int[countOfElements];
        progression[0] = firstNumber;
        for(int i = 1; i < progression.length; i++){
            progression[i] = progression[i - 1] + firstNumber;
        }
        return progression;
    }

    private String generateQuestion(int[] progression, int randomElement) {
        String question = "Question: ";
        for(int i = 0; i < progression.length; i++){
            if (progression[i] == progression[randomElement]) {
                question = question + " ..";
            } else {
                question = question + " " + progression[i];
            }
        }
        return question;
    }

    public String getGameCondition() {
        return CONDITION;
    }
}
