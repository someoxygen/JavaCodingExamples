import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int number = random.nextInt(min,max+1);
        int guess = 0;
        int attempt = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess the number between %d - %d\n",min,max);
        System.out.print("Your guess: ");

        do {
            guess = scanner.nextInt();
            if(guess < number){
                System.out.println("Your guess is TOO LOW!");
                attempt++;
            }
            else if(guess > number){
                System.out.println("Your guess is TOO HIGH!");
                attempt++;
            }else{
                System.out.println("You are CORRECT. Number is : " + guess);
                System.out.println("Attempts: "+ attempt);
            }
        }while (guess != number);

        scanner.close();
    }
}
