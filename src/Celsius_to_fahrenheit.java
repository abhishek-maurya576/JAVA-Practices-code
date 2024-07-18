import java.util.Scanner;

public class Celsius_to_fahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter the temperature: ");
        Scanner scan = new Scanner(System.in);
        float temp = scan.nextInt();
        temp = temp * 9 / 5 + 32;
        System.out.println("Temperature in fahrenheit: " + temp + "f");
    }
}
