import java.io.*;
import java.util.*;
public class FileReader1 {

  
    public static void main(String[] args) {
        // read a  file
            try{
                File file = new File("abc.txt");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    System.out.println(line);
                }

            }catch(IOException x){
                x.getStackTrace();
            }
    }
    
}

    

