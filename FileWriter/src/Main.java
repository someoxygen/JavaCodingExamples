import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        String filePath = "C:\\Users\\Dizutsu\\Desktop\\filewriter.txt";
        String text = """
                I like Pizza.
                Buy me a pizza please.
                Thank you sir...
                """;
        //FileWriter writer = new FileWriter(filePath)
        try(FileWriter writer = new FileWriter("filewriter.txt")) {
            //writer.write("I like Pizza.");
            writer.write(text);
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File cant be write for some reason.");
        }
    }
}
