// Import InputMismatchException: the exception thrown by Scanner when the user enters text where a number (int) is expected. Used by the outer catch block.
import java.util.InputMismatchException;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Student Result System that accepts a student's name and marks
 * for 3 subjects using a nested try-catch block.
 */
public class Q3_ResultSystem {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Outer try-catch: Handle InputMismatchException
        try {
            // Print a prompt asking the user to enter the student's name.
            System.out.print("Enter student name: ");
            // Read the whole name line typed by the user.
            String name = sc.nextLine();
            // Print a prompt asking the user to enter the number of subjects.
            System.out.print("Enter number of subjects: ");
            // Read the number of subjects as an integer.
            int subjectCount = sc.nextInt();

            // Create an array whose size equals the number of subjects.
            int[] marks = new int[subjectCount];
            // Variable to accumulate the sum of all marks, started at 0.
            int total = 0;

            // Loop through each subject to read its marks one by one.
            for (int i = 0; i < subjectCount; i++) {
                // Print a prompt asking for the current subject's marks.
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                // Read the current subject's marks and store them in the array at position i.
                marks[i] = sc.nextInt();
                // Add the current subject's marks to the running total.
                total += marks[i];
            }

            // Inner try-catch: Handle ArithmeticException and ArrayIndexOutOfBoundsException
            try {
                // Calculate the average by dividing the total by the number of subjects.
                // This throws ArithmeticException if subjectCount is 0.
                double average = total / subjectCount;
                // Print the student's name.
                System.out.println("\nStudent: " + name);
                // Print the computed average marks.
                System.out.println("Average Marks: " + average);

                // Demonstrate ArrayIndexOutOfBoundsException
                // Loop from 0 up to AND including subjectCount, so on the last
                // iteration i equals the array size and accessing marks[i] is out of bounds.
                for (int i = 0; i <= subjectCount; i++) {
                    // Print the marks of each subject using its index.
                    System.out.println("Marks of subject " + (i + 1) + ": " + marks[i]);
                }
            } catch (ArithmeticException e) {
                // Runs when a mathematical error such as division by zero occurs.
                System.out.println("ArithmeticException: Cannot calculate average when the number of subjects is zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Runs when the loop accesses an index that is outside the array.
                System.out.println("ArrayIndexOutOfBoundsException: Invalid subject index accessed.");
            }
        } catch (InputMismatchException e) {
            // Runs when the user types text instead of a number somewhere inside the outer try block.
            System.out.println("InputMismatchException: User entered text instead of marks.");
            // Consume the leftover invalid input so the Scanner stays usable.
            sc.nextLine();
        }
    }
}