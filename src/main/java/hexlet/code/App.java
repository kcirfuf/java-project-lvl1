package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User player = new User();
        String gamesFeatures = "Please enter the game number and press Enter.\n"
                + "0 - Exit\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n";
        System.out.println(gamesFeatures);
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "6":
                Prime prime = new Prime();
                Engine.runGame(player, prime);
                break;
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
