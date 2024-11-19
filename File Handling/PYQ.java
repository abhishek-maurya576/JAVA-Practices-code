import java.util.Scanner;
import java.io.*;
public class PYQ {
    public static void main(String[] args) {
        File myFile = new File("abc.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }sc.close();
        }
            catch(FileNotFoundException x){
                System.out.println("File not found");
                System.out.println(x.getMessage());
            }
        }
    }
    

