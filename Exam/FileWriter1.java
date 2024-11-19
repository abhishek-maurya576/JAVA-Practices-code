import java.io.*;
public class FileWriter1 {
    public static void main(String[] args) {
        try{
            File myfile = new File("abc.txt");
            FileWriter f = new FileWriter(myfile);
            f.write("public class Print" );
            f.close();
        }catch(Exception x){
            System.out.println("Error");
            System.out.println(x.getMessage());
        }
    }    
}
