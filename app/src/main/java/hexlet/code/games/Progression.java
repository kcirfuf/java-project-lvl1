package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression implements Game {
    private static final byte PROGRESSION_ELEMENTS_COUNT = 10;
    private static final byte LOWER_BOUND_FOR_QUESTION = 1;
    private static final byte UPPER_BOUND_FOR_QUESTION = 10;
    private static final String CONDITION = "What number is missing in the progression?";

    public String run() {
        int firstNumber = Engine.generateRandomNumber();
        int step = Engine.generateRandomNumber();
        int randomElementForQuestion =  Engine.generateRandomNumber(LOWER_BOUND_FOR_QUESTION, UPPER_BOUND_FOR_QUESTION);
        int[] progression = generateProgression(firstNumber, step, PROGRESSION_ELEMENTS_COUNT);
        String question = generateQuestion(progression, randomElementForQuestion);
        System.out.println(question);
        return String.valueOf(progression[randomElementForQuestion]);
    }

    private int[] generateProgression(int firstNumber, int step, int countOfElements) {
        int[] progression = new int[countOfElements];
        progression[0] = firstNumber;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    private String generateQuestion(int[] progression, int randomElement) {
        String question = "Question: ";
        for (int i = 0; i < progression.length; i++) {
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
