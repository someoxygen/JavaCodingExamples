
public class stringMethods {
    public static void main(String[] args){
        String name = "Mustafa";
        String fullName = "Mustafa Yücel";

        char character = name.charAt(2);
        System.out.println("Character is: " + character);

        int index = name.indexOf("a");
        System.out.println("Index is: " + index);

        int lastIndex = name.lastIndexOf("a");
        System.out.println("LastIndex is: " + lastIndex);

        String upperCaseName = name.toUpperCase();
        System.out.println("UpperCaseName: " + upperCaseName);

        String lowerCaseFullName = fullName.toLowerCase();
        System.out.println("LowerCaseFullName: " + lowerCaseFullName);

        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }else{
            System.out.println("Your name is not empty.");
        }

        if(fullName.toLowerCase().equals("password")){
            System.out.println("Your full name cant be password.");
        }
        else{
            System.out.println("Hello " + fullName);
        }

        if(name == "Metin"){
            System.out.println("Your name is Mustafa");
        }else{
            System.out.println("Your name is " + name);
        }

    }
}
