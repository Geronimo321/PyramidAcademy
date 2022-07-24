import java.util.Scanner;

public class dragon {
    static void prompt() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Which cave will you go into? (1 or 2)\n");
            int in = input.nextInt();
            if (in == 1) {
                System.out.println(story(1));
            } else if (in == 2) {
                System.out.println(story(2));
            } else {
                System.out.println("Please choose 1 or 2");
                prompt();
            }
        } catch (Exception e) {
            System.out.println("That's not one of the options.");
            prompt();
        }
    }

    static String story(int num){
        //BAD DRAGON
        if(num == 2){
            return "You approach the cave...\n" +
                    "It is dark and spooky\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!";
        }else{//GOOD DRAGON
            return "You approach the cave...\n" +
                    "It is dark and spooky\n" +
                    "A large dragon sits upon a mound of gold.\n" +
                    "He tells you to take as much gold as you want";
        }
    }
}
