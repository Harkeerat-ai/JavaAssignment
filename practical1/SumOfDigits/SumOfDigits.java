// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;

/**
 * Reads an integer from the user and computes the sum of its digits.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // Ask the user to type the number whose digits should be summed.
        System.out.println("Please enter the number to find its sum of digits : ");
        // Read the number typed by the user.
        int num = sc.nextInt();
        // temp keeps a copy of num so we can peel off digits without losing the original.
        int temp = num;
        // sum accumulates the digits as they are extracted, started at 0.
        int sum = 0;

        // Extract each digit using modulo and add it to sum
        // Keep looping until every digit has been removed from temp.
        while (temp > 0) {
            // The modulo operator gives the units digit at each step.
            int digit = temp % 10;
            // Add the extracted digit to the running sum.
            sum += digit;
            // Remove the units digit by integer-dividing by 10.
            temp /= 10;
        }

        // Print the final total of all the digits.
        System.out.println("The sum of digits = " + sum);
    }
}