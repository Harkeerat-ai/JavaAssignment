// Import InputMismatchException: the exception thrown by Scanner when the user enters text where a number (int) is expected. Used by the catch block.
import java.util.InputMismatchException;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Student Marks System that accepts marks for a subject count,
 * calculates the average and demonstrates one try block with
 * multiple catch blocks.
 */
public class Q2_MarksSystem {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // One try block protects all the input and calculation statements below,
        // and each possible error is handled by its own matching catch block.
        try {
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
                // Read the input as a String so it can be converted manually (demonstrates NumberFormatException).
                String input = sc.next();
                // Convert the String into an integer and store it in the array at position i.
                marks[i] = Integer.parseInt(input);
                // Add the current subject's marks to the running total.
                total += marks[i];
            }

            // Calculate the average by dividing the total by the number of subjects.
            // This divides by zero (and throws ArithmeticException) if subjectCount is 0.
            double average = total / subjectCount;

            // Print a prompt asking for the index of the marks to display.
            System.out.print("Enter index to display marks for: ");
            // Read that index as an integer.
            int index = sc.nextInt();
            // Print the marks stored at that index; an invalid index throws ArrayIndexOutOfBoundsException.
            System.out.println("Marks at index " + index + ": " + marks[index]);

            // Print the final computed average.
            System.out.println("Average Marks: " + average);
        } catch (InputMismatchException e) {
            // Runs when the user types text instead of a number.
            System.out.println("InputMismatchException: User entered text instead of marks.");
            // Consume the leftover invalid input so the Scanner stays usable.
            sc.nextLine();
        } catch (NumberFormatException e) {
            // Runs when a String cannot be converted into an integer correctly.
            System.out.println("NumberFormatException: Marks are entered as a string and converted incorrectly.");
        } catch (ArithmeticException e) {
            // Runs when a mathematical error such as division by zero occurs.
            System.out.println("ArithmeticException: Cannot calculate average when the number of subjects is zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Runs when the marks array is accessed using an invalid index.
            System.out.println("ArrayIndexOutOfBoundsException: Marks array accessed using an invalid index.");
        }
    }
}