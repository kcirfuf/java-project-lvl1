package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Random;

public final class Calc implements Game {
    private static final String CONDITION = "What is the result of the expression?";
    private String question = "";
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;
    private final String[] operations = {"*", "+", "-"};
    public String run() {
        int intRandomFirst = Utils.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        int intRandomSecond = Utils.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        String operation = getRandomElement(operations);
        setGameQuestion(intRandomFirst, operation, intRandomSecond);
        //System.out.println("Question: " + intRandomFirst + " " + operation + " " + intRandomSecond);
        int tmpResult = 0;
        String result = "";
        switch (operation) {
            case "*":
                tmpResult = intRandomFirst * intRandomSecond;
                result = String.valueOf(tmpResult);
                break;
            case "+":
                tmpResult = intRandomFirst + intRandomSecond;
                result = String.valueOf(tmpResult);
                break;
            case "-":
                tmpResult = intRandomFirst - intRandomSecond;
                result = String.valueOf(tmpResult);
                break;
            default:
                System.out.println("Bad operation");
                System.exit(0);
        }
        return result;
    }

    public String getGameCondition() {
        return this.CONDITION;
    }

    public void setGameQuestion(int randomFirst, String operation, int randomSecond) {
        this.question = "Question: " + randomFirst + " " + operation + " " + randomSecond;
    }

    public String getGameQuestion() {
        return this.question;
    }
    private String getRandomElement(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
