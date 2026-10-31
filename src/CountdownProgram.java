import java.util.Scanner;

public class CountdownProgram {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter what number you want to countdown: ");
        int number = scanner.nextInt();

        for(int i = number ; i > 0 ; i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!!!");

        scanner.close();
    }
}
