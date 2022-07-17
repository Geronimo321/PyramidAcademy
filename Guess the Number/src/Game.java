import java.util.Random;
import java.util.Scanner;

public class Game {
    int attempts;
    String name;
    int num;

    public Game(String name){
        attempts= 0;
        this.name = name;

        Random rand = new Random();
        num = rand.nextInt(20) + 1;
    }

    public void playGame(){
        Scanner input = new Scanner(System.in);
        int guess;
        System.out.println("Well, "+name+" I'm thinking of a number between 1 and 20.");
        guess = takeGuess(input);
        do {
            if(guess == num){
                playAgain(true, input);
            } else if (guess > num) {
                System.out.println("Your number is too high.");
                guess = takeGuess(input);
            }else if(guess < num){
                System.out.println("Your number is too low.");
                guess = takeGuess(input);
            }
        }while (attempts < 6);
        playAgain(false, input);
        return;
    }

    public void reset(){
        attempts = 0;
        Random rand = new Random();
        num = rand.nextInt(20) + 1;
    }

    public void playAgain(boolean win, Scanner scanner){
        if(win){
            System.out.println("Good job, "+name+" You guessed my number in "+ attempts+" guesses!");
        }else{
            System.out.println("Sorry "+name+", you didn't guess in 6 attempts.");
        }

        System.out.println("Would you like to play again? ");
        String choice;
        do{
            System.out.println("(y or n)");
            while(!scanner.hasNext()){
                System.out.println("(y or n)");
                scanner.next();
            }
            choice = scanner.next();
        }while (!choice.equals("y") && !choice.equals("n") );

        if(choice.equals("y")){
            reset();
            playGame();
        }else {
            scanner.close();
            System.exit(0);
        }
    }

    public int takeGuess(Scanner num){
        //System.out.println("number is "+ this.num);
        int guess =-1;
        do{
            System.out.println("Take a guess.");
            while(!num.hasNextInt()){
                System.out.println("That's not a valid guess.");
                num.next();
            }
            guess = num.nextInt();
        }while (guess <0 );
        attempts++;
        return guess;
    }
}
