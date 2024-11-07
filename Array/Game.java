import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initialize the locationCells and other variables
        int[] locationCells = {2, 3, 4}; // Example locations
        int numOfHits = 0;
        String result;
        
        // Loop to allow multiple guesses
        while (true) {
            // Get user guess
            System.out.print("Enter your guess (0-6) or -1 to exit: ");
            int guess = input.nextInt();
            
            // Check if the user wants to exit
            if (guess == -1) {
                System.out.println("Exiting the game.");
                break; // Exit the loop
            }
            
            // Reset result for each guess
            result = "miss";

            // Check the guess against the locationCells
            for (int cell : locationCells) {
                if (guess == cell) {
                    result = "hit";
                    numOfHits++;
                    break;
                }
            }
            
            // Check if all cells have been hit
            if (numOfHits == locationCells.length) {
                result = "kill";
            }
            
            // Output the result
            System.out.println(result);
        }
        
        // Close the scanner
        input.close();
    }
}