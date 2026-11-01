import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        ArrayList<String> words = createWords();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        try{
            String word = words.get(random.nextInt(words.size()));
            ArrayList<Character> wordState = new ArrayList<>();
            int wrongGuesses = 0;

            for(int i = 0; i < word.length(); i++){
                wordState.add('_');
            }
            System.out.println("************************");
            System.out.println("Welcome to Java Hangman!");
            System.out.println("************************");

            while(wrongGuesses < 6){

                System.out.print(getHangmanArt(wrongGuesses));

                System.out.print("Word: ");

                for(char c : wordState){
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.print("Guess a letter: ");
                char guess = scanner.next().toLowerCase().charAt(0);

                if(word.indexOf(guess) >= 0){
                    System.out.println("Correct guess!");

                    for(int i = 0; i < word.length(); i++){
                        if(word.charAt(i) == guess){
                            wordState.set(i, guess);
                        }
                    }

                    if(!wordState.contains('_')){
                        System.out.print(getHangmanArt(wrongGuesses));
                        System.out.println("YOU WIN!");
                        System.out.println("The word was: " + word);
                        break;
                    }
                }
                else{
                    wrongGuesses++;
                    System.out.println("Wrong guess!");
                }
            }

            if(wrongGuesses >= 6){
                System.out.print(getHangmanArt(wrongGuesses));
                System.out.println("GAME OVER!");
                System.out.println("The word was: " + word);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Bound must be positive.");
        }

        scanner.close();

    }

    private static ArrayList<String> createWords() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("carrot");
        words.add("card");
        words.add("people");
        words.add("prison");
        words.add("mason");
        words.add("mustard");
        words.add("cat");
        words.add("dog");
        words.add("bird");
        words.add("pencil");
        words.add("bread");
        words.add("bottle");
        words.add("necklace");
        words.add("garden");
        words.add("telephone");
        words.add("computer");
        return words;
    }

    static String getHangmanArt(int wrongGuesses){

        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                    
                      """;
            case 4 -> """
                       o
                      /|\\
                    
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}