import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args){
        String[] fruits = {"apple","orange","grape","strawberry"};
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println();
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println();
        Arrays.fill(fruits,"pineapple");
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        String[] foods;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the foods array size: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter the name of your food: ");
            foods[i] = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Your Foods:");
        for(String food:foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
