import java.util.Scanner;

/**
 * Generates and prints the Fibonacci series up to a user-specified number of
 * terms. Each term is the sum of the two preceding terms (starting with 0, 1).
 */
public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the range of the series : ");
        int range = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Series : \n" + a);

        // Generate subsequent terms by adding the previous two
        for (int i = 1; i <= range; i++) {
            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
