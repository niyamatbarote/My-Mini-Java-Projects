import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 0 == Rock , 1 == Paper, 2 == Scissor
        System.out.println("0 For Rock, 1 For Paper, 2 For Scissor");
        System.out.println("Enter Your Choice: ");
        int a = sc.nextInt();

        int b = rd.nextInt(0, 3);

        if (a < 0 || a > 2) {
            System.out.println("Error ..!! \"Choose a Number Between 0 - 2 \"");
            return; // Stop Execution
        }

        if (a == b) {
            System.out.println(" Draw ..!!");
        } else if (a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0) {
            System.out.println("OOPS You Lost..!! Better Luck Next Time");
        } else {
            System.out.println("Congrats You Won ..!!");
        }

        if (a == 0) {
            System.out.println("Your Choice was ROCK");
        } else if (a == 1) {
            System.out.println("Your Choice was PAPER");
        } else {
            System.out.println("Your Choice was SCISSOR");
        }

        if (b == 0) {
            System.out.println("Computer's Choice was : ROCK");
        } else if (b == 1) {
            System.out.println("Computer's Choice was : PAPER");
        } else {
            System.out.println("Computer's Choice was : SCISSOR");
        }
    }
}
