import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last odd number: ");
        int range = sc.nextInt();

        if (range % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int m = (range + 1) / 2;
        int sum = (m % 2 == 0) ? -m : m;

        System.out.println("Sum = " + sum);
    }
}