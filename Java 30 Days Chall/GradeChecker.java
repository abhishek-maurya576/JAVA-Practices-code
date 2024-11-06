import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their score
        System.out.print("Enter your score (0-100): ");
        double score = scanner.nextDouble();

        // Check if the score is within the valid range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            // Determine the letter grade
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Output the result
            System.out.printf("Your score: %.2f\n", score);
            System.out.println("Your grade: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}