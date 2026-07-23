import java.util.Scanner;

/**
 * Computes the sum of the series (i^2 / i!) for i = 1 to a user-specified
 * range. Each term is calculated as the square of i divided by the factorial of i.
 */
public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the range of the series : ");
        int range = sc.nextInt();

        double sum = 0;

        // Compute each term: i^2 / i!
        for (int i = 1; i <= range; i++) {
            double exp = i * i;
            double fact = 1;

            // Calculate factorial of i
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }

            double div = exp / fact;
            sum += div;
        }

        System.out.println("Sum of the series for the range : " + range + " = " + sum);
    }
}
