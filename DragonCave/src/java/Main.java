import java.util.Scanner;


public class Main {
    public static void main (String[]args) {

        dragon drag = new dragon();
        System.out.println("You are in a land full of dragons.\n" +
                "In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.");
        drag.prompt();
    }
}
