import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Day wednesday = Day.WEDNESDAY;
        System.out.println(wednesday);
        System.out.println(wednesday.getDayValue());

        switch (wednesday){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("Its a weekday!");
            case SATURDAY,SUNDAY -> System.out.println("Its a weekend!");
            default -> System.out.println("Wrong day format.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day:");
        String dayName = scanner.nextLine().toUpperCase();
        try {
            Day day = Day.valueOf(dayName);

            switch (day){
                case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("Its a weekday!");
                case SATURDAY,SUNDAY -> System.out.println("Its a weekend!");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Wrong day name format.");
        }


        scanner.close();
    }
}
