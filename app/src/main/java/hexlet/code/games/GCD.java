package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD implements Game {
    private static final String CONDITION = "Find the greatest common divisor of given numbers.";
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;
    public String run() {
        int firstNumber = Engine.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        int secondNumber = Engine.generateRandomNumber(LOWERBOUND, UPPERBOUND);
        System.out.println("Question: " + firstNumber + " " + secondNumber);
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
}
