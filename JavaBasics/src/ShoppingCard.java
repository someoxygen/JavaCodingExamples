import java.util.Scanner;

public class ShoppingCard {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String food = scanner.nextLine();

        System.out.print("What is the price for each item?: ");
        double price = scanner.nextDouble();

        System.out.print("How many item would you buy?: ");
        int amount = scanner.nextInt();

        System.out.println("You have bought" + amount + " " + food + "/s");
        System.out.println("Your total is $" + price * amount);

        scanner.close();
    }
}
