// Import InputMismatchException: the exception thrown by Scanner when the user enters text where an integer is expected. Used to demonstrate exception handling.
import java.util.InputMismatchException;
// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;
// Note: The other exception types shown below (ArithmeticException, ArrayIndexOutOfBoundsException, etc.) belong to java.lang, so they do NOT need a separate import.

/**
 * Demonstrates exception handling using try-catch for 7 common exceptions.
 * A separate try-catch block is used for each exception.
 */
public class Q1_Exceptions {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // 1. ArithmeticException: Cannot divide by zero
        // Guard the division below so the crash can be caught and reported.
        try {
            // Declare two integers, where 'b' is zero.
            int a = 10, b = 0;
            // Dividing by zero is not allowed, so this line throws ArithmeticException.
            System.out.println("Division result: " + (a / b));
        } catch (ArithmeticException e) {
            // Runs when a division by zero is attempted.
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        // 2. ArrayIndexOutOfBoundsException: Invalid array index
        // Guard the array access below so an invalid index is handled.
        try {
            // Create an array big enough to hold only 5 elements (indexes 0 to 4).
            int[] numbers = new int[5];
            // Index 10 does not exist in the array, so this throws ArrayIndexOutOfBoundsException.
            numbers[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Runs when an array is accessed using an invalid index.
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        // 3. NumberFormatException: Marks must be numeric. Enter your roll number: abc
        // Guard the string-to-number conversion below.
        try {
            // Print a prompt asking the user to enter their roll number.
            System.out.print("Marks must be numeric. Enter your roll number: ");
            // Read the typed text as a String.
            String roll = sc.next();
            // Try to convert the String into an integer; this fails and throws
            // NumberFormatException if the user typed something like "abc".
            int rollNumber = Integer.parseInt(roll);
            // This line only runs if the conversion succeeded.
            System.out.println("Roll number accepted: " + rollNumber);
        } catch (NumberFormatException e) {
            // Runs when the string cannot be converted into a number.
            System.out.println("NumberFormatException: Marks must be numeric. Enter your roll number: abc");
        }

        // 4. InputMismatchException: Please enter an integer.
        // Guard the nextInt() call below so wrong input types are handled.
        try {
            // Print a prompt asking the user for an integer.
            System.out.print("Please enter an integer: ");
            // nextInt() throws InputMismatchException if the user enters non-numeric text.
            int value = sc.nextInt();
            // This line only runs if a valid integer was received.
            System.out.println("Integer accepted: " + value);
        } catch (InputMismatchException e) {
            // Runs when the user types something that is not an integer.
            System.out.println("InputMismatchException: Please enter an integer.");
            sc.nextLine(); // clear the invalid input
        }

        // 5. NullPointerException: Student name is null.
        // Guard the method call on the null reference below.
        try {
            // Declare a String that does not point to any object (it is null).
            String studentName = null;
            // Calling .length() on a null reference throws NullPointerException.
            System.out.println("Student name length: " + studentName.length());
        } catch (NullPointerException e) {
            // Runs when a method is called on a null reference.
            System.out.println("NullPointerException: Student name is null.");
        }

        // 6. StringIndexOutOfBoundsException: Invalid character index.
        // Guard the charAt() call below so a bad index is handled.
        try {
            // Store the word "Java" in a String variable.
            String word = "Java";
            // Index 10 is out of range (the string has only 4 characters),
            // so this throws StringIndexOutOfBoundsException.
            System.out.println("Character at index 10: " + word.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            // Runs when a character index is outside the string's length.
            System.out.println("StringIndexOutOfBoundsException: Invalid character index.");
        }

        // 7. IllegalArgumentException: Marks must be between 0 and 100.
        // Guard the validation logic below so invalid marks are reported.
        try {
            // Print a prompt asking the user for marks.
            System.out.print("Enter marks (between 0 and 100): ");
            // Read the marks entered by the user as an integer.
            int marks = sc.nextInt();
            // Check whether the marks are outside the allowed 0-100 range.
            if (marks < 0 || marks > 100) {
                // Marks are invalid, so throw an IllegalArgumentException with a helpful message.
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            // This line only runs if the marks were valid.
            System.out.println("Marks accepted: " + marks);
        } catch (IllegalArgumentException e) {
            // Runs when an argument has an illegal value (the marks were out of range).
            System.out.println("IllegalArgumentException: Marks must be between 0 and 100.");
        }
    }
}