import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the calculation format (F/C):");
        String format = scanner.next().toUpperCase();
        double newTemperature = (format == "C") ? (temperature - 32) * 5/9  : (temperature + 32) * 9/5;
        System.out.printf("Temperature = %.2f°%s",newTemperature,format);

        scanner.close();
    }
}
