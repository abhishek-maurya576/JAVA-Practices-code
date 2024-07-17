import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a = 5;
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();
        System.out.println("You entered: "+a);
        boolean myName = true;
        System.out.println(myName);
        float myFloat = 5.5f;
        System.out.println(myFloat);
        String wishes = " Hey how are you";
        System.out.println(wishes);
    }
}