import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() throws InterruptedException {
        System.out.println("Hello");
        System.out.println("Please enter your name");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Hey, " + name + ". I'm thinking of a number between 1 and 100.");
        System.out.println("Guess what the number is");

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while (true) {

            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e){
                String bad_input = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not between 1 and 100. Try again.");
                continue;
            }

            tries += 1;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You guessed the number in " + tries + " tries!");
                break;
            }
        }

        //Alternate for the computer guessing a number you choose
        /*System.out.println("Hello");
        System.out.println("Please enter your name");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Hey, " + name + ". Choose a number between 1 and 100. I will try to guess that number.");
        System.out.println("Enter your number");

        int number = 0;
        int tries = 0;
        int minNumberPossible = 1;
        int maxNumberPossible = 100;

        while (true) {

            int newNumber;

            try {
                newNumber = input.nextInt();
            } catch (InputMismatchException e){
                String bad_input = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (newNumber < 1 || newNumber > 100) {
                System.out.println(newNumber + " is not between 1 and 100. Try again.");
                continue;
            }

            number = newNumber;
            break;
        }

        System.out.println("Now I will guess.");
        Thread.sleep(250);

        while (true) {

            Random rand = new Random();
            int guess = rand.nextInt(minNumberPossible, maxNumberPossible + 1);

            tries += 1;

            System.out.println("Is it " + guess);
            Thread.sleep(250);

            if (guess < number) {
                System.out.println("Okay, so my guess is too low, I'll try again.");
                minNumberPossible = guess + 1;
            } else if (guess > number) {
                System.out.println("Okay, so my guess is too low, I'll try again.");
                maxNumberPossible = guess - 1;
            } else {
                System.out.println("Sweet, I got it right!");
                System.out.println("I guessed the number in " + tries + " tries!");
                break;
            }
        }*/
    }
}
