import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice;
        String computerChoice;
        String playAgain = "yes";
        String[] game = {"rock","paper","scissors"};
        System.out.println("************************************");
        System.out.println("Welcome to Rock Paper Scissors Game!");
        System.out.println("************************************");

        do{
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            computerChoice = game[random.nextInt(3)];
            System.out.println("Computers choice: "+ computerChoice);
            if(!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")){
                System.out.println("You write wrong choice.");
            }

            if(computerChoice.equals(choice)){
                System.out.println("Its a tie!!!");
            }
            else if((choice.equals("rock") && computerChoice.equals("scissors")) ||
                    (choice.equals("paper") && computerChoice.equals("rock")) ||
                    (choice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!!!");
            }
            else{
                System.out.println("You lose!!!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine();
        }while (playAgain.equals("yes"));

        System.out.println("Thanks for playing...");

        scanner.close();
    }
}
