import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rectangle width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the rectangle height: ");
        double height = scanner.nextDouble();

        System.out.println("Your area is = " + width + " * " + height + " = " + width * height + "cm²");
        scanner.close();
    }
}
