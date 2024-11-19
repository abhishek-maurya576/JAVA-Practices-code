import java.io.*;
public class FileCreation {
    public static void main(String[] args) {
        // Create a new file
            try{
                File file = new File("abc.java");
                if(file.createNewFile()){
                    System.out.println("Successfully created new file");
                }else{
                    System.out.println("File is already exist");
                }
            }catch(IOException x){
                x.getStackTrace();
            }
    }
    
}
