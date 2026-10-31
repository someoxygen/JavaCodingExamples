import java.util.Scanner;

public class ArraySearchExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = {10,5,7,8,9,15,150,125,30,95};
        String[] fruitsArray = {"apple","orange","banana"};
        boolean isNumberFound = false;
        boolean isFruitFound = false;
        System.out.print("Write number to search for: ");
        int targetNumber = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < numbersArray.length; i++){
            if(targetNumber == numbersArray[i]){
                System.out.println("Number found in index of -> " + i);
                isNumberFound = true;
                break;
            }
        }

        if(!isNumberFound){
            System.out.println("Number not found in array.");
        }

        System.out.print("Write fruit name to search for: ");
        String targetFruit = scanner.nextLine();

        for(int i = 0; i< fruitsArray.length; i++){
            if(targetFruit.equals(fruitsArray[i])){
                System.out.println("Fruit found in index of -> " + i);
                isFruitFound = true;
                break;
            }
        }

        if(!isFruitFound){
            System.out.println("Fruit not found in array.");
        }

        scanner.close();
    }
}
