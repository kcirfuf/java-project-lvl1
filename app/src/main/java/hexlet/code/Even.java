package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {

    public static final byte MAX_SUCCESS_GAMES_COUNT = 3;
    public static final byte UPPERBOUND = 25;
    public static final String CONDITIONOFGAME = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void even(User player) {

        byte countSuccessGames = 0;

        Random rand = new Random();
        Scanner scEven = new Scanner(System.in);

        System.out.println(CONDITIONOFGAME);

        while (countSuccessGames < MAX_SUCCESS_GAMES_COUNT) {
            int intRandom = rand.nextInt(UPPERBOUND);
            System.out.println("Question: " + intRandom);
            String userAnswer = scEven.nextLine();
            boolean divisionResult =  division(intRandom);
            if ((userAnswer.equals("yes") && divisionResult)
                    || (userAnswer.equals("no") && !divisionResult)) {
                countSuccessGames++;
                System.out.println("Correct!");
            } else {
                if (divisionResult) {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'no'.");
                }
                System.out.println("Let's try again " + player.getName());
                System.exit(0);
            }
        }
        System.out.println("Congratulations " + player.getName());
        System.exit(0);
    }
    private static boolean division(int number) {
        boolean result;
        result = number % 2 == 0;
        return result;
    }
}
