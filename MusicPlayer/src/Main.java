import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //HOW TO PLAY AUDIO WITH JAVA (.wav, .au, .aiff)
        //CHANGE YOUR FILEPATH TO YOUR PC MUSIC FILE ADDRESS OTHERWISE ITS NOT WORKING SOMETIMES
        String filePath = "src\\good-day-by-snoozybeats.wav";
        File file = new File(filePath);
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")){
                System.out.println("P= Play");
                System.out.println("Q= Quit");
                System.out.println("S= Stop");
                System.out.println("R= Reset");
                System.out.print("Enter your choice:");
                response = scanner.next().toUpperCase();
                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
        catch (FileNotFoundException e ){
            System.out.println("File not found.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported media type.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Line unavailable.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
