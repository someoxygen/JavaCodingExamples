import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 second to enter your name!");
        System.out.print("Enter your name: ");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        String name = scanner.nextLine();
        System.out.println("Your name is "+ name);
        scanner.close();
    }
}
