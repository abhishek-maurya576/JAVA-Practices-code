import java.io.*;
public class NewFileCreate {
    public static void main(String[] args) {
        //Creating a new file
        File myfile = new File("NewText.txt");
        try{
            //Creating a new file
            myfile.createNewFile();
            System.out.println("File is Created");
        }catch(IOException x){
            System.out.println("File is not created"+x);
        }

    }
    
}
