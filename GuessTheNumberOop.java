import java.util.Random;
import java.util.Scanner;

class Game {
    int guess;
    int random;
    int attempt = 0;

    Game() {
        Random rd = new Random();
        random = rd.nextInt(101);
    }

    public void Guess() {
        attempt++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Guess Number : ");
        guess = sc.nextInt();
    }

    boolean isCorrect() {
        if (guess == random) {
            System.out.println("Your Guess is Correct : " + random + " Was The Random Number ");
            System.out.println("You Guess The Number in : " + attempt + " Attempts");
            return true;
        } else if (guess > random) {
            System.out.println("Too High.. Guess SMALLER Number");
        } else if (guess < random) {
            System.out.println("Too Low .. Guess GREATER Number");
        }
        return false;
    }
}

public class GuessTheNumberOop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean c = false;

        while (!c) { // True for continuing the Game After Another
            // Object Created :-
            Game game = new Game();
            boolean b = false;
            // Game Initializing :-

            while (!b) { // This while loop is used to take multiple guessed/inputs from user

                game.Guess();
                b = game.isCorrect();
                // game.Repeat();

            }
            System.out.println(" Do You Want to Play Again? (yes/no) : ");
            String str = sc.next().toLowerCase();
            if (str.equalsIgnoreCase("no")) {
                System.out.println("Thanks for Playing Game... BYE..!!");
                c = true;
            } else {
                c = false; // Not needed though to write c = false ==
            }
        }

    }

}
