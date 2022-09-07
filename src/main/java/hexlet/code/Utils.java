package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    private static final Random RAND = new Random();
    private static final byte UPPERBOUND = 12;
    private static final byte LOWERBOUND = 1;

    public static int generateRandomNumber(int lowerBound, int upperBound) {
        return RAND.nextInt(lowerBound, upperBound);
    }
    public static int generateRandomNumber() {
        return RAND.nextInt(LOWERBOUND, UPPERBOUND);
    }

    public static String readFromConsole() {
        Scanner scEngine = new Scanner(System.in);
        return scEngine.nextLine();
    }
}
