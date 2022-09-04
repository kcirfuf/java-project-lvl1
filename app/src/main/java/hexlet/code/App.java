package hexlet.code;
import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User player = new User();
        String gamesFeatures = "Please enter the game number and press Enter.\n"
                + "5 - Progression\n"
                + "4 - GCD\n"
                + "3 - Calc\n"
                + "2 - Even\n"
                + "1 - Greet\n"
                + "0 - Exit\n";
        System.out.println(gamesFeatures);
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "5":
                Progression progression = new Progression();
                Engine.runGame(player, progression);
                break;
            case "4":
                GCD gcd = new GCD();
                Engine.runGame(player, gcd);
                break;
            case "3":
                Calc calc = new Calc();
                Engine.runGame(player, calc);
                break;
            case "2":
                Even even = new Even();
                Engine.runGame(player, even);
                break;
            case "1":
                Cli.greeting(player);
                break;
            case "0":
            default:
                System.exit(0);
        }
    }
}
