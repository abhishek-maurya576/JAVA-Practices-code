import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("Choose an option: \n1. Addition\t\t2. Subtraction\n3. Multiplication\t4. Division\n5. Exit");
            choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Thanks for using the calculator");
                break; // Exit the loop
            }

            System.out.println("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The addition is: " + add(num1, num2));
                    break;

                case 2:
                    System.out.println("The subtraction is: " + sub(num1, num2));
                    break;

                case 3:
                    System.out.println("The multiplication is: " + multiply(num1, num2));
                    break;

                case 4:
                    double result = div(num1, num2);
                    if (result != Double.NaN) {
                        System.out.println("The division is: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        input.close(); // Close the scanner to prevent resource leak
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double div(int a, int b) {
        if (b == 0) {
            System.out.println("Can't divide by zero");
            return Double.NaN; // Return NaN for division by zero
        } else {
            return (double) a / b; // Cast to double for accurate division
        }
    }
}