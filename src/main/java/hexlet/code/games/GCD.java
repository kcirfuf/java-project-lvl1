package hexlet.code.games;

import hexlet.code.Utils;

public final class GCD implements Game {
    private static final String CONDITION = "Find the greatest common divisor of given numbers.";
    private String question = "";
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;
    public String run() {
        int firstNumber = Utils.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        int secondNumber = Utils.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        setGameQuestion(firstNumber, secondNumber);
        //System.out.println("Question: " + firstNumber + " " + secondNumber);
        int tmpResult = 0;
        tmpResult = evklid(firstNumber, secondNumber);
        String result = String.valueOf(tmpResult);
        return result;
    }
/*
    Алгоритм Евклида.
    Большее число делим на меньшее.
    Если делится без остатка, то меньшее число и есть НОД (следует выйти из цикла).
    Если есть остаток, то большее число заменяем на остаток от деления.
    Переходим к пункту 1.
 */
    private int evklid(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return evklid(n2, n1 % n2);
    }
    public String getGameCondition() {
        return CONDITION;
    }

    public void setGameQuestion(int firstNumber, int secondNumber) {
        this.question = "Question: " + firstNumber + " " + secondNumber;
    }

    public String getGameQuestion() {
        return this.question;
    }
}
