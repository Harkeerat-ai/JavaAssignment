/**
 * Checks whether a number provided as a command-line argument is a Strong number.
 * A Strong number is one where the sum of the factorials of its digits equals
 * the number itself (e.g., 145 = 1! + 4! + 5!).
 */
public class StrongNumber {
    public static void main(String cp[]) {

        int num = Integer.parseInt(cp[0]);
        System.out.println("Num = " + num);

        int original = num;
        int sum = 0;

        // Process each digit of the number
        while (original > 0) {
            int digit = original % 10;
            int fact = 1;

            // Calculate factorial of the current digit
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
                System.out.println("Fact in = " + fact);
            }

            System.out.println("Fact = " + fact);
            sum += fact;
            System.out.println("Sum = " + sum);

            original = original / 10;
        }

        // Check if sum of digit factorials equals the original number
        if (sum == num) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not strong number");
        }
    }
}
