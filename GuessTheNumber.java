import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(201);
        while (true) {
            System.out.println("Guess The Number Between 0 to 200 : ");
            int attempt = 0;
            int max_attempt = 10;

            while (attempt < max_attempt) {
                int guess = sc.nextInt();

                attempt++;

                if (guess == random) {
                    System.out.println("You Guessed it Right the Correct Number is: " + random);
                    System.out.println("You Guessed The Correct Answers Only in : " + attempt + " Attempts ");
                    break;
                }
                if (guess > random) {
                    System.out.println("Too High. Try SAMALLER Number");
                } else {
                    System.out.println("Too Low .. Try GREATER Number");
                }
            }
            if (attempt == max_attempt) {
                System.out.println("Out of Attempts Correct Answer Was : " + attempt);
            }
            System.out.println("Do You Want to Play Again? (yes/no)");
            String choice = sc.next().toLowerCase();
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Good Bye .. Happy to Entertain You");
                break;

            }
        }
    }
}
