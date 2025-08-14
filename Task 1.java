import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("=== Welcome to the Number Guessing Game ===");

        while (playAgain) {
            int lowerBound = 1;
            int upperBound = 100;
            int maxAttempts = 7;
            int numberToGuess = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI have picked a number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess;

                // Input validation
                if (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    sc.next(); // discard invalid input
                    continue;
                }

                guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            // Ask to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
                System.out.println("Thanks for playing! Final score: " + score);
            }
        }

        sc.close();
    }
}