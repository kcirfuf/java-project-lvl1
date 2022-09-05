package hexlet.code;
import hexlet.code.games.User;
import  java.util.Scanner;

public class Cli {

    public static void greeting(User player) {
        Scanner scCli = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scCli.nextLine();
        player.setName(name);
        System.out.println("Hello, " + name + "!");
    }
}
