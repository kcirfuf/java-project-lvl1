package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final byte MAX_SUCCESS_GAMES_COUNT = 3;
    private static final byte UPPERBOUND = 12;
    private static final Random RAND = new Random();
    public static void runGame(User player, Game game) {
        Cli.greeting(player);
        System.out.println(game.getGameCondition());
        byte countOfGames = 0;
        while (countOfGames < MAX_SUCCESS_GAMES_COUNT) {
            String rightAnswer = game.run();
            String userAnswer = Engine.readFromConsole();
            if (userAnswer.equals(String.valueOf(rightAnswer))) {
                System.out.println("Correct!");
                countOfGames++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer);
                System.out.println("Let's try again, " + player.getName());
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }
    public static String readFromConsole() {
        Scanner scEngine = new Scanner(System.in);
        return scEngine.nextLine();
    }

    public static int generateRandomNumber() {
        int intRandom = RAND.nextInt(UPPERBOUND);
        return intRandom;
    }
}
