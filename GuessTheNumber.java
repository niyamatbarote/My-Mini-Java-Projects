import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int random = rd.nextInt(201);
        System.out.println("Guess a Number Between 0 to 200 :  ");
        int guess = sc.nextInt();

        int attempt = 5;
        int max_attempt = 5;

        while (guess != random) {
            attempt++;
            max_attempt--;
            if (guess > 200) {
                System.out.println("Error...!! CHOOSE A NUMBER BETWEEN 0 TO 200");
                return;
            } else if (max_attempt == 0) {
                System.out.println("You lose Your All Attempts Try Again...");
                return;
            }

            if (random == guess) {
                System.out.println("Congrats..!! Your Guess Is Correct..");
                return;
            } else if (random < guess) {
                System.out.println("Your Guess is MORE Than the Actual Number, Choose a SMALLER Number..!! ");
                guess = sc.nextInt();
            } else {
                System.out.println("Your Guess is LESS Than the Actual Number, Choose a GREATER  Number..!! ");
                guess = sc.nextInt();
            }
        }
        System.out.println("Congrats..!! You Guessed The Number in " + attempt + " Attempts");

        System.out.println("The Correct Number Was : " + random);

    }
}
