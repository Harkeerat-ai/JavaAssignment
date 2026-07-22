import java.util.Scanner;

/**
 * Swaps two integer values without using a temporary variable.
 * Uses arithmetic operations (addition and subtraction) to perform the swap.
 */
public class SwapWithoutVars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int b = sc.nextInt();

        // Swap using arithmetic: a becomes sum, b becomes original a, a becomes original b
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Numbers after swapping are A : " + a + " and B : " + b);
    }
}
