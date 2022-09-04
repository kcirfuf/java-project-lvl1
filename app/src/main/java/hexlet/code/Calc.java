package hexlet.code;

import java.util.Random;

public final class Calc implements Game {
    private static final String CONDITION = "What is the result of the expression?";
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;
    private final String[] operations = {"*", "+", "-"};
    public String run() {
        int intRandomFirst = Engine.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        int intRandomSecond = Engine.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        String operation = getRandomElement(operations);
        System.out.println("Question: " + intRandomFirst + " " + operation + " " + intRandomSecond);
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

    private String getRandomElement(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
