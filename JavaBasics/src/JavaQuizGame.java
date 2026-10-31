import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args){
        String[] questions = {"What is the main function of the router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is the known as father of computer?",
                              "What was the first programming language?"};
        String[][] options = {{"1. Storing Files","2. Encyrpting data","3. Directing internet traffic","4. Managing Passwords"},
                              {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
                              {"1. COBOL","2. C","3. Fortran","4. Assembly"}};

        int[] answers = {3,1,2,4,3};
        int correctAnswers = 0;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("*******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Give your answer: ");
            answer = scanner.nextInt();
            if(answer == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                correctAnswers++;
            }
            else{
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }
        System.out.println("You give " + correctAnswers + " correct answers on this " + questions.length + " questions quiz!!!");
        scanner.close();
    }

}
