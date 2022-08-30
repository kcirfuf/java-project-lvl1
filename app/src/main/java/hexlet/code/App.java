package hexlet.code;
import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User player = new User();
        String gamesFeatures = "Please enter the game number and press Enter.\n"
                + "3 - Calc\n"
                + "2 - Even\n"
                + "1 - Greet\n"
                + "0 - Exit\n";
        System.out.println(gamesFeatures);
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        switch (userChoice) {
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
