import java.io.*;
import java.util.Scanner;
public class ReadFileExample {
    public static void main(String[] args) {
        File obj = new File("NewText.txt");
        try {
            Scanner in = new Scanner(obj);
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }in.close();

        }catch(IOException x){
            System.out.println("Error reading file"+ x.getMessage());
        }
    }
}
