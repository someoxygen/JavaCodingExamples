import java.util.Scanner;

public class UserChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if(username.length() >= 4 && username.length() <= 12 && !username.contains(" ") && !username.contains("_")){
            System.out.println("Your username is valid.");
        }
        else {
            System.out.println("Your username is not valid.");
        }

        scanner.close();
    }
}
