// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Swaps two integer values without using a temporary variable.
 * Uses arithmetic operations (addition and subtraction) to perform the swap.
 */
public class SwapWithoutVars {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Ask the user to type the first number.
        System.out.println("Please enter the first number : ");
        // Read the first number into variable a.
        int a = sc.nextInt();
        // Ask the user to type the second number.
        System.out.println("Please enter the second number : ");
        // Read the second number into variable b.
        int b = sc.nextInt();

        // Swap using arithmetic: a becomes sum, b becomes original a, a becomes original b
        // Step 1: a now holds the sum of both numbers.
        a = a + b;
        // Step 2: subtracting the new b gives the original a value, which is stored into b.
        b = a - b;
        // Step 3: subtracting the new b (original a) from the sum leaves the original b, stored into a.
        a = a - b;

        // Print both numbers after the swap to confirm they exchanged values.
        System.out.println("Numbers after swapping are A : " + a + " and B : " + b);
    }
}