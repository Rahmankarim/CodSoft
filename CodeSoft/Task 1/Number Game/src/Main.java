import java.util.Random;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int minRange = 1;
                int maxRange = 100;
                int score = 0;

                boolean playAgain = true;

                while (playAgain) {


                    int targetNumber = random.nextInt(maxRange) ;

                    System.out.println("\n\t\t---Welcome to the Number Guessing Game---");
                    System.out.println("\n\t\t\tGuess any number between " + minRange + " and " + maxRange + ".");

                    int attempts = 0;



                    while (true) {
                        System.out.print("\n\t\t\tEnter your guessed Number: ");

                        int guess = scanner.nextInt();

                        if (guess == targetNumber) {
                            System.out.println("\n\t\t\tCongratulations! You've guessed the correct number in "+attempts+" attempts.");
                            score++;
                            System.out.println("\n\t\t\tScore:"+score);
                            break;
                        } else if (guess < targetNumber) {
                            System.out.println("\n\t\t\tToo low! Try again.");
                        } else {
                            System.out.println("\n\t\t\tToo high! Try again.");
                        }

                        attempts++;
                        System.out.println("\n\t\t\tNumber of Attempts: "+attempts);
                        System.out.println("_______________________________________________");
                    }



                    System.out.print("\n\t\t\tDo you want to play again enter 1 if not enter 0: ");
                    int playChoice = scanner.nextInt();
                    if (playChoice!=1) {
                        playAgain = false;
                    }
                }

                System.out.println("\n\t\t\tGame over! Your score is: " + score);
                scanner.close();
            }
        }




