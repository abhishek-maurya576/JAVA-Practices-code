import java.io.*;
public class FileWriter2 {
    public static void main(String[] args) {
        File myFile = new File("NewText.txt");
        try{
            FileWriter writer = new FileWriter("NewText.txt");
            writer.write("Hello, this is my new text file write from java");
            System.out.println("written on the file");
            writer.close();
        }catch(IOException x){
            System.out.println("Error writing the file"+x.getMessage());
        }

    }
}
