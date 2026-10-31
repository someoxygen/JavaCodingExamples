import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //EXAMPLE1 NUMBER ARRAYLIST
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(-30);
        numbers.add(150);

        System.out.println(numbers);
        for(Integer number:numbers){
            System.out.println(number);
        }

        System.out.println("*********************************");

        numbers.remove(2);
        numbers.set(1,190);

        System.out.println(numbers);
        for(Integer number:numbers){
            System.out.println(number);
        }

        Collections.sort(numbers);
        System.out.println(numbers);

        //EXAMPLE2 STRING ARRAYLIST
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Winterberry");

        System.out.println(fruits);

        fruits.remove(2);
        fruits.set(0,"Pineapple");
        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(2));

        fruits.add("Banana");

        Collections.sort(fruits);
        System.out.println(fruits);

        //EXAMPLE3 SCANNER WITH ARRAYLIST

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the number of cars: ");
        int carCount = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> cars = new ArrayList<>();
        for(int i = 0; i < carCount ; i++){
            System.out.print("Write the model of the car:");
            cars.add(scanner.nextLine());
        }
        System.out.println(cars);

    }
}
