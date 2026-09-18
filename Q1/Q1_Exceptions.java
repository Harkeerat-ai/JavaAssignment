// Import InputMismatchException: the exception thrown when the input does not match the expected type (e.g. text given where an integer is expected). Used to demonstrate exception handling.
import java.util.InputMismatchException;
// Note: The other exception types shown below (ArithmeticException, ArrayIndexOutOfBoundsException, etc.) belong to java.lang, so they do NOT need a separate import.

/**
 * Demonstrates exception handling using try-catch blocks for 7 common exceptions.
 * A separate try-catch block is used for each exception type to show how each one
 * is thrown and caught.
 */
public class Q1_Exceptions {
    public static void main(String[] args) {
        // 1. ArithmeticException: division by zero
        // Typing the protected code inside a try block so a thrown exception can be handled.
        try {
            // Create two integers where 'b' is zero.
            int r = 10 / 0;
            // This line never runs because the division above already throws an exception.
            System.out.println("Result: " + r);
        }
        // Catch the ArithmeticException that is thrown when dividing by zero.
        catch (ArithmeticException e) {
            // Print a friendly message explaining what went wrong.
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        // 2. ArrayIndexOutOfBoundsException: Invalid array index
        // Guard the array access so the crash can be caught and reported.
        try {
            // Create an array big enough to hold only 3 elements (indexes 0, 1 and 2).
            int[] arr = new int[3];
            // Try to access index 5, which does not exist, so an exception is thrown here.
            System.out.println("Accessing arr[5] = " + arr[5]);
        }
        // Catch the exception thrown when an invalid array index is used.
        catch (ArrayIndexOutOfBoundsException e) {
            // Print a friendly message explaining the invalid index.
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index");
        }

        // 3. NumberFormatException: Marks must be numeric
        // Guard the conversion so a wrongly formatted string is handled gracefully.
        try {
            // "abc" is not a number, so converting it to an int throws NumberFormatException.
            Integer.parseInt("abc");
        }
        // Catch the exception thrown when a string cannot be converted into a number.
        catch (NumberFormatException e) {
            // Print a friendly message explaining that marks must be numeric.
            System.out.println("NumberFormatException: Marks must be numeric");
        }

        // 4. InputMismatchException: Please enter an integer
        // This block throws the exception manually using the 'throw' keyword.
        try {
            // Force an InputMismatchException to be created and thrown on purpose.
            throw new InputMismatchException();
        }
        // Catch the exception and show its message.
        catch (InputMismatchException e) {
            // Print a friendly message explaining that only integers are accepted.
            System.out.println("InputMismatchException: Please enter an integer");
        }

        // 5. NullPointerException: Student name is null
        // Guard the operation on a null reference.
        try {
            // Declare a String variable that does not point to any object (it is null).
            String name = null;
            // Calling .length() on a null reference throws NullPointerException.
            System.out.println("Student name length: " + name.length());
        }
        // Catch the exception thrown when a method is called on a null reference.
        catch (NullPointerException e) {
            // Print a friendly message explaining that the student name is null.
            System.out.println("NullPointerException: Student name is null");
        }

        // 6. StringIndexOutOfBoundsException: Invalid character index
        // Guard the charAt() call so a bad index is handled.
        try {
            // Request the character at index 10, but the string "Java" has only 4 characters.
            "Java".charAt(10);
        }
        // Catch the exception thrown when a character index is out of range.
        catch (StringIndexOutOfBoundsException e) {
            // Print a friendly message explaining the invalid character index.
            System.out.println("StringIndexOutOfBoundsException: Invalid character index");
        }

        // 7. IllegalArgumentException: Marks must be between 0 and 100
        // Guard the validation logic.
        try {
            // Store a marks value that is outside the allowed range.
            int marks = 150;
            // Check if the marks are outside the valid 0-100 range.
            if (marks < 0 || marks > 100)
                // Marks are invalid, so throw an IllegalArgumentException with a helpful message.
                throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        // Catch the exception thrown when an argument has an illegal value.
        catch (IllegalArgumentException e) {
            // Print the detailed message that was passed when the exception was thrown.
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}