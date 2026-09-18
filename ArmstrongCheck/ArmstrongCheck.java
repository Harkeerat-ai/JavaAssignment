// Import Scanner: used to read text input typed on the keyboard.
import java.util.Scanner;
// Import Math: provides the pow() method used to raise a digit to the power of the number of digits.
import java.lang.Math;

/**
 * Checks whether a given number is an Armstrong number.
 * An Armstrong number is one where the sum of its digits each raised to the
 * power of the total number of digits equals the original number.
 */
public class ArmstrongCheck {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Read the whole number typed by the user and store it in num.
        int num = sc.nextInt();
        // tempc keeps a copy of num so we can count digits without losing the original; tempa is another copy for extracting digits later.
        int tempc = num, tempa = num;
        // sum will hold the total of every digit raised to the power of the digit count, started at 0.
        int sum = 0;
        // count will track how many digits the number has, started at 0.
        int count = 0;

        // Count the number of digits
        while (tempc > 0) {
            // Each digit removed from the number means one more digit, so increment the counter.
            count++;
            // Remove the last digit by integer-dividing by 10.
            tempc /= 10;
        }

        // Extract each digit and add digit^count to the sum
        while (tempa > 0) {
            // Get the last digit using the modulo operator (% 10 gives the units place).
            int digit = tempa % 10;
            // Raise this digit to the power of the digit count and add it to the running sum.
            sum += Math.pow(digit, count);
            // Remove the last digit by integer-dividing by 10.
            tempa /= 10;
        }

        // If the sum of the powered digits equals the original number, it is an Armstrong number.
        if (sum == num)
            System.out.println(num + " is an armstrong number!");
        // Otherwise the number is not an Armstrong number.
        else
            System.out.println(num + " is not an armstrong number!");
        // Close the Scanner to release the keyboard resource.
        sc.close();
    }
}