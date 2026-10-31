import java.util.Scanner;

public class MathPlayground {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a first number: ");
        double a = scanner.nextDouble();

        System.out.print("Give me a second number: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse is: " + c + "cm");

        System.out.print("Give me the radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference is : %.2fcm\n", circumference);

        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("Area is : %.2fcm²\n", area);

        scanner.close();
    }
}
