package hexlet.code;

import hexlet.code.games.Game;

public class Engine {
    private static final byte MAX_SUCCESS_GAMES_COUNT = 3;
    public static void runGame(User player, Game game) {
        Cli.greeting(player);
        System.out.println(game.getGameCondition());
        for (int i = 0; i < MAX_SUCCESS_GAMES_COUNT; i++) {
            String rightAnswer = game.run();
            System.out.println(game.getGameQuestion());
            String userAnswer = Utils.readFromConsole();
            if (userAnswer.equals(String.valueOf(rightAnswer))) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer);
                System.out.println("Let's try again, " + player.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }
}
