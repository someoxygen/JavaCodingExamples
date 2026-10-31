import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = scanner.nextLine();

        //REGULAR SWITCH VERSION

//        switch (day){
//            case "Monday" :
//                System.out.println("Its a weekday.");
//                break;
//            case "Tuesday" :
//                System.out.println("Its a weekday.");
//                break;
//            case "Wednesday" :
//                System.out.println("Its a weekday.");
//                break;
//            case "Thursday" :
//                System.out.println("Its a weekday.");
//                break;
//            case "Friday" :
//                System.out.println("Its a weekday.");
//                break;
//            case "Saturday" :
//                System.out.println("Its a weeekend.");
//                break;
//            case "Sunday" :
//                System.out.println("Its a weeekend.");
//                break;
//            default:
//                System.out.println(day + " is not a day.");
//                break;
//        }

        //ENHANCED SWITCH VERSION -> AFTER JAVA 14
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its a weekday. 😦");
            case "Saturday", "Sunday" -> System.out.println("Its a weeekend. 😀");
            default -> System.out.println(day + " is not a day.");
        }

        scanner.close();
    }
}
