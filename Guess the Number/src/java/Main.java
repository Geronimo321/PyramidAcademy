import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        try{
            String name = scanner.next();
            Game game = new Game(name);
            game.playGame();
        }catch (Exception e){
            System.out.println("Sorry, something went wrong");
        }
    }
}
