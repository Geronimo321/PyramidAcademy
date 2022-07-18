import java.util.Scanner;

public class Main {
    static void prompt() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Which cave will you go into? (1 or 2)\n");
            int in = input.nextInt();
            if (in == 1) {
                System.out.println("You approach the cave...\n" +
                        "It is dark and spooky\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "Gobbles you down in one bite!");
            } else if (in == 2) {
                System.out.println("You approach the cave...\n" +
                        "It is dark and spooky\n" +
                        "A large dragon sits upon a mound of gold.\n" +
                        "He tells you to take as much gold as you want");
            } else {
                System.out.println("Please choose 1 or 2");
                prompt();
            }
        } catch (Exception e) {
            System.out.println("That's not one of the options.");
            prompt();
        }
    }
    public static void main (String[]args){
        System.out.println("You are in a land full of dragons.\n" +
                "In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.");
        prompt();

    }
}
