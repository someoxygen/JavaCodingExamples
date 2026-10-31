import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the operator ( + , - , * , / , % , ^ ): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if(number2 == 0){
                    System.out.println("Number cannot be divide by zero.");
                    validOperation = false;
                }
                else{
                    result = number1 / number2;
                }
            }
            case '%' -> result = number1 % number2;
            case '^' -> result = Math.pow(number1,number2);
            default -> {
                System.out.println("Its not a valid operator.");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.println(number1+ " " + operator + " " + number2 + " = " + result);
        }

        scanner.close();
    }
}
