// Import InputMismatchException: the exception thrown by Scanner when the user enters text where a number (int) is expected. Used to demonstrate exception handling.
import java.util.InputMismatchException;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Student Marks System that reads marks for 3 subjects from the keyboard,
 * calculates their average and demonstrates a single try block followed by
 * multiple catch blocks, each handling a different exception type.
 */
public class Q2_MarksSystem {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // One try block protects all the statements below, and each type of
        // error is caught by its own matching catch block.
        try {
            // Print a prompt asking the user to enter marks for the 3 subjects.
            System.out.print("Enter marks for 3 subjects: ");
            // Read the first subject's marks as an integer.
            int s1 = sc.nextInt();
            // Read the second subject's marks as an integer.
            int s2 = sc.nextInt();
            // Read the third subject's marks as an integer.
            int s3 = sc.nextInt();
            // Store the three marks in an integer array so they can be accessed by index.
            int[] marks = {s1, s2, s3};
            // Try to access index 5, which does not exist (the array only holds 3 elements),
            // so this deliberately throws an ArrayIndexOutOfBoundsException.
            System.out.println("Accessing marks[5] = " + marks[5]);
            // Number of subjects used for the average calculation.
            int subj = 3;
            // Calculate the average by adding all marks and dividing by the subject count.
            // The ternary operator (subj > 0 ? subj : 1) avoids dividing by zero by falling back to 1.
            double avg = (s1 + s2 + s3) / (subj > 0 ? subj : 1);
            // Print the calculated average to the console.
            System.out.println("Average: " + avg);

        } catch (InputMismatchException e) {
            // Runs when the user types text instead of numbers for the marks.
            System.out.println("InputMismatchException: user enters text instead of marks");
        } catch (ArithmeticException e) {
            // Runs if an arithmetic problem such as division by zero occurs.
            System.out.println("ArithmeticException: cannot calculate average when subjects is zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Runs when the marks array is accessed with an index outside 0-2.
            System.out.println("ArrayIndexOutOfBoundsException: invalid index on marks array");
        } catch (NumberFormatException e) {
            // Runs if a string is converted into a number incorrectly.
            System.out.println("NumberFormatException: marks entered as string and converted incorrectly");
        }

        // Close the Scanner to release the input resource attached to it.
        sc.close();
    }
}