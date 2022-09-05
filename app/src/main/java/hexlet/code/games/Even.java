package hexlet.code.games;

import hexlet.code.Engine;

public final class Even implements Game {
    private static final String CONDITION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;
    public String run() {
        int intRandom = Engine.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        System.out.println("Question: " + intRandom);
        return division(intRandom) ? "yes" : "no";
    }
    private static boolean division(int number) {
        boolean result;
        result = number % 2 == 0;
        return result;
    }

    public String getGameCondition() {
        return this.CONDITION;
    }
}
