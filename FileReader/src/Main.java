import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("filewriter.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            System.out.println("Use FileWriter project to write a related file.");
        } catch (IOException e) {
            System.out.println("Something went wrong when reading file.");
        }
    }
}
