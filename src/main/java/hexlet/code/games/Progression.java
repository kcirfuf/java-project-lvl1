package hexlet.code.games;
import hexlet.code.Utils;

public final class Progression implements Game {
    private static final byte PROGRESSION_ELEMENTS_COUNT = 10;
    private static final byte LOWER_BOUND_FOR_QUESTION = 1;
    private static final byte UPPER_BOUND_FOR_QUESTION = 10;
    private static final String CONDITION = "What number is missing in the progression?";
    private String question = "";

    public String run() {
        int firstNumber = Utils.generateRandomNumber();
        int step = Utils.generateRandomNumber();
        int randomElementForQuestion = Utils.generateRandomNumber(LOWER_BOUND_FOR_QUESTION, UPPER_BOUND_FOR_QUESTION);
        int[] progression = generateProgression(firstNumber, step, PROGRESSION_ELEMENTS_COUNT);
        setGameQuestion(progression, randomElementForQuestion);
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

    public String getGameCondition() {
        return CONDITION;
    }

    public void setGameQuestion(int[] progression, int randomElement) {
        String tmpQuestion = "Question: ";
        for (int i = 0; i < progression.length; i++) {
            if (progression[i] == progression[randomElement]) {
                tmpQuestion = tmpQuestion + " ..";
            } else {
                tmpQuestion = tmpQuestion + " " + progression[i];
            }
        }
        this.question = tmpQuestion;
    }

    public String getGameQuestion() {
        return this.question;
    }
}
