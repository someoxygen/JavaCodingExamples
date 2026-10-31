import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student?(true/false): ");
        boolean isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You didnt enter your name! 😡");
        }
        else{
            System.out.println("Your name is " + name + " 😄😄😄");
        }


        if(age >= 18){
            System.out.println("You are an adult. 👴");
        }
        else if(age <= 0){
            System.out.println("You are not born yet. 🍊");
        }
        else{
            System.out.println("You are a child. 🧒");
        }

        if(isStudent){
            System.out.println("You are a student. 👨‍🎓");
        }
        else{
            System.out.println("You are not a student. 👨‍💼");
        }

        scanner.close();
    }
}
