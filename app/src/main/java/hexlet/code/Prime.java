package hexlet.code;

public final class Prime implements Game{
    private static final String CONDITION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final byte UPPERBOUND = 100;
    private static final byte LOWERBOUND = 1;
    public String run() {
        int randomNumber = Engine.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        System.out.println("Question: " + randomNumber);
        return checkPrime(randomNumber);
    }
    private String checkPrime(int number) {
        String result  = "";
        if (number == 1) {
            return "no";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = "no";
                break;
            } else {
                result = "yes";
            }
        }
        return result;
    }

    public String getGameCondition() {
        return CONDITION;
    }
}
