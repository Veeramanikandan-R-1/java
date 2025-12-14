import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        try (FileWriter myObj = new FileWriter("test.txt", true);) {
            myObj.write("test string");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details

        }
    }
}