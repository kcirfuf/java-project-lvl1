package hexlet.code;

public final class Even implements Game {
    private static final String CONDITION = "Answer 'yes' if number even otherwise answer 'no'.";

    public String run() {
        int intRandom = Engine.generateRandomNumber();
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
