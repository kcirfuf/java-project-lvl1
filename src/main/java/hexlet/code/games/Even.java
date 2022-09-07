package hexlet.code.games;

import hexlet.code.Utils;

public final class Even implements Game {
    private static final String CONDITION = "Answer 'yes' if number even otherwise answer 'no'.";
    private String question = "";
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;
    public String run() {
        int intRandom = Utils.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        setGameQuestion(intRandom);
        //System.out.println("Question: " + intRandom);
        return division(intRandom) ? "yes" : "no";
    }
    private static boolean division(int number) {
        boolean result;
        result = number % 2 == 0;
        return result;
    }
    public void setGameQuestion(int randomNumber) {
        this.question = "Question: " + randomNumber;
    }

    public String getGameQuestion() {
        return this.question;
    }
    public String getGameCondition() {
        return this.CONDITION;
    }
}
