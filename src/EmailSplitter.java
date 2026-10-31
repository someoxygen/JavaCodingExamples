import java.util.Scanner;

public class EmailSplitter {
    public static void main(String[] args){
        System.out.print("Enter your email address: ");

        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        if(email.contains("@")){
            String address = email.substring(0,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Email address: "+ address);
            System.out.println("Email domain: "+ domain);
        }
        else{
            System.out.println("Your email is not valid.");
        }

        scanner.close();
    }
}
