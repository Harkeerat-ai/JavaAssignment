// Import InputMismatchException: the exception thrown by Scanner when the user types text where a number is expected. Used by the outer catch block.
import java.util.InputMismatchException;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Student Result System that accepts a student's name and marks for 3 subjects
 * and demonstrates a nested try-catch structure: an outer try-catch that handles
 * input errors and an inner try-catch that handles calculation errors.
 */
public class Q3_ResultSystem {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        try {                              // Outer try-catch
            // Print a prompt asking the user to enter the student's name.
            System.out.print("Enter student name: ");
            // Read the name entered by the user as a String.
            String name = sc.next();       // may throw InputMismatchException
            try {                          // Inner try-catch
                // Print a prompt asking the user to enter marks for the 3 subjects.
                System.out.print("Enter marks for 3 subjects: ");
                // Read the first subject's marks as an integer.
                int s1 = sc.nextInt();
                // Read the second subject's marks as an integer.
                int s2 = sc.nextInt();
                // Read the third subject's marks as an integer.
                int s3 = sc.nextInt();
                // Calculate the average by adding the marks and dividing by the number of subjects (3).
                double avg = (s1 + s2 + s3) / 3;
                // Print the student's name together with their calculated average.
                System.out.println("Result for " + name + ": Average = " + avg);
            } catch (ArithmeticException e) {
                // Runs if a mathematical error occurs, such as dividing by zero while averaging.
                System.out.println("Inner: ArithmeticException while calculating average if subjects is zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Runs if the marks array is accessed with an invalid subject index.
                System.out.println("Inner: ArrayIndexOutOfBoundsException on invalid subject index");
            }
        } catch (InputMismatchException e) {
            // Runs when the user types text where a number was expected.
            System.out.println("Outer: InputMismatchException if user enters text instead of marks");
        }

        // Close the Scanner to release the input resource attached to it.
        sc.close();
    }
}