import java.util.Random;

public class RandomValueGenerator {
    public static void main(String[] args){
        Random random = new Random();
        int number1 = random.nextInt(1,7);
        double number2 = random.nextDouble(1,7);
        int number3 = random.nextInt(1,101);

        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println("Number3: " + number3);

        boolean isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
