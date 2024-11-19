import java.io.*;
public class FileCreate {
    public static void main(String[] args) {
        // Create a new file
        File xFile = new File("XYZ.txt");
        try{
            xFile.createNewFile();
        }catch(IOException x){
            System.out.println("Unable to create File "+ x.getMessage());
        }
    }
    
}
