import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();

        Game game = new Game(name);
        game.playGame();
    }
}