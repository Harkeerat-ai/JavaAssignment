import java.util.Scanner;

/**
 * Reads an integer from the user and computes the sum of its digits.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to find its sum of digits : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        // Extract each digit using modulo and add it to sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("The sum of digits = " + sum);
    }
}
