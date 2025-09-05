import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain = true;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1-100. Can you guess it in " + maxAttempts + " tries?");

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;

            while (attempts < maxAttempts && !guessed) {
                System.out.print("\nEnter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println(" Correct! You guessed it in " + attempts + " attempts!");
                    score += (maxAttempts - attempts + 1);
                    guessed = true;
                } else if (guess < targetNumber) {
                    System.out.println(" Too low! " + (maxAttempts - attempts) + " attempts remaining.");
                } else {
                    System.out.println(" Too high! " + (maxAttempts - attempts) + " attempts remaining.");
                }
            }

            if (!guessed) {
                System.out.println("\n Game over! The number was: " + targetNumber);
            }

            System.out.print("\nPlay again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\n Your final score: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
