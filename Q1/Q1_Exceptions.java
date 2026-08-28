import java.util.InputMismatchException;

public class Q1_Exceptions {
    public static void main(String[] args) {
        // 1. ArithmeticException: division by zero
        try { int r = 10 / 0; System.out.println("Result: " + r); }
        catch (ArithmeticException e) { System.out.println("ArithmeticException: Cannot divide by zero"); }

        // 2. ArrayIndexOutOfBoundsException: Invalid array index
        try { int[] arr = new int[3]; System.out.println("Accessing arr[5] = " + arr[5]); }
        catch (ArrayIndexOutOfBoundsException e) { System.out.println("ArrayIndexOutOfBoundsException: Invalid array index"); }

        // 3. NumberFormatException: Marks must be numeric
        try { Integer.parseInt("abc"); } 
        catch (NumberFormatException e) { System.out.println("NumberFormatException: Marks must be numeric"); }

        // 4. InputMismatchException: Please enter an integer
        try { throw new InputMismatchException(); } 
        catch (InputMismatchException e) { System.out.println("InputMismatchException: Please enter an integer"); }

        // 5. NullPointerException: Student name is null
        try { String name = null; System.out.println("Student name length: " + name.length()); }
        catch (NullPointerException e) { System.out.println("NullPointerException: Student name is null"); }

        // 6. StringIndexOutOfBoundsException: Invalid character index
        try { "Java".charAt(10); } 
        catch (StringIndexOutOfBoundsException e) { System.out.println("StringIndexOutOfBoundsException: Invalid character index"); }

        // 7. IllegalArgumentException: Marks must be between 0 and 100
        try { 
            int marks = 150; 
            if (marks < 0 || marks > 100) throw new IllegalArgumentException("Marks must be between 0 and 100"); 
        } 
        catch (IllegalArgumentException e) { System.out.println("IllegalArgumentException: " + e.getMessage()); }
    }
}