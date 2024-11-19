import java.io.*;
public class FileDeleteExample {
    public static void main(String[] args) {
        try{
            File file = new File("abc.java");
            if(file.delete()){
                System.out.println("File deleteed succefully");
            }else{
                System.out.println("File not found");
            }
        }catch(Exception x){
            System.out.println("Error deleting file"+x.getMessage());
        }
    }
}
