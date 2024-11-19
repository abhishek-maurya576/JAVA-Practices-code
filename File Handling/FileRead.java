import java.io.*;
import java.util.Scanner;
public class FileRead {
    public static void main(String[] args) {
        File myFile = new File("Xyz.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
                
            }
            sc.close();
        }catch(FileNotFoundException x){
            System.out.println("Error reading file");
            System.out.println(x.getMessage());
        }
    }
}
