import java.io.*;
public class FileWriter1 {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("XYZ.txt");
            obj.write("Hey this is my first file had i write via java code\n or you are a hansome man");
            obj.close();
        }catch(IOException x){
            System.out.println("Error"+ x.getMessage());
        }
        
    }
    
}
