import java.io.*;
import java.util.*;
public class PyqSame{
    public static void main(String[] args) {
        File input = new File("abc.txt");
        File output = new File("def.txt");
        try{
            Scanner sc = new Scanner(input);
            FileWriter writer = new FileWriter("def.txt");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                writer.write(line +"\n");

            }
            sc.close();
            writer.close();
        }
        
        catch(FileNotFoundException x){
            System.out.println("File not found");
            System.out.println(x.getMessage());
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
    }
}