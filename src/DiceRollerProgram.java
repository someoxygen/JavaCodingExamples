import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("************************************");
        System.out.println("Welcome to Dice Rolling Program");
        System.out.println("************************************");
        System.out.print("Enter the amount of dice you want to roll: ");
        int count = scanner.nextInt();
        int total = 0;
        if(count <= 0) {
            System.out.println("You need to enter a number more than zero.");
        }else {
            for(int i = 0; i < count; i++){
                int diceValue = random.nextInt(1,7);
                System.out.printf("Dice value: %d\n",diceValue);
                printDice(diceValue);
                total += diceValue;
            }
            System.out.printf("Total value of your dices: %d\n",total);
        }

        scanner.close();
    }

    private static void printDice(int diceValue) {
        String dice1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
                """;
        String dice2 = """
                 ---------
                | ●       |
                |         |
                |       ● |
                 ---------
                """;
        String dice3 = """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------
                """;
        String dice4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                """;
        String dice5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                """;
        String dice6 = """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                """;
        switch (diceValue){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Your dice value is invalid.");
        }
    }
}