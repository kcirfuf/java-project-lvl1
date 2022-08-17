package hexlet.code;
import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User player = new User();
        String gamesFeatures = "Please enter the game number and press Enter.\n"
                + "2 - Even\n"
                + "1 - Greet\n"
                + "0 - Exit\n";
        System.out.println(gamesFeatures);
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "2":
                Cli.greeting(player);
                Even.even(player);
            case "1":
                Cli.greeting(player);
            case "0":
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}
