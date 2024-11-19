import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert byte to character
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
