import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double balance = 0;
        boolean isExit = false;

        while (!isExit){
            System.out.println("****************************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************************");
            System.out.println("Choose your operation:");
            System.out.println("1-SHOW BALANCE");
            System.out.println("2-DEPOSIT");
            System.out.println("3-WITHDRAW");
            System.out.println("4-EXIT");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isExit = true;
            }
        }

        System.out.println("****************************");
        System.out.println("THANKS FOR CHOOSING US!!!");
        System.out.println("****************************");

        scanner.close();
    }

    private static double withdraw(double balance) {
        System.out.print("Enter amount of balance: ");
        double amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("Amount should be less than your balance.");
            return 0;
        }
        else if(amount <= 0){
            System.out.println("Amount should be more than zero.");
            return 0;
        }
        else{
            return amount;
        }
    }

    private static double deposit() {
        System.out.print("Enter amount of balance: ");
        double amount = scanner.nextDouble();
        if(amount <= 0){
            System.out.println("Amount should be more than zero.");
            return 0;
        }
        else{
            return amount;
        }
    }

    private static void showBalance(double amount) {
        System.out.printf("Your current balance is: $%.2f\n\n",amount);
    }
}
