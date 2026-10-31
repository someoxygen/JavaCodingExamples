public class Main {
    public static void main(String[] args){
        //MY FIRST JAVA PROGRAM
        System.out.println("Hello World!");
        System.out.print("I like pizza.\n");
        System.out.println("Buy me a pizza.");

        int age = 31;
        String name = "Mustafa";
        double gpa = 2.4;
        boolean isStudent = false;
        char surname = 'Y';

        System.out.println("My name is " + name + " " + surname + ". I'm " + age + " years old.");
        System.out.println("My gpa is " + gpa + " right now.");
        if(isStudent){
            System.out.println("I'm still a student.");
        }
        else{
            System.out.println("I graduated years ago.");
        }
    }
}
