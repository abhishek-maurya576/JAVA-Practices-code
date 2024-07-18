
import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
    //celsius to fahrenheit
        System.out.print("Enter the temperature: ");
        Scanner scan = new Scanner(System.in);
        float temp = scan.nextInt();
        temp = temp*9;
        temp = temp/5;
        temp = temp + 32;
        System.out.println("Temperature in fahrenheit: "+temp + "f");
    }
}
