import java.util.Scanner;

public class Q4_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();
            System.out.print("Enter withdrawal amount: ");
            double amt = sc.nextDouble();
            double balance = 110000;

            if (amt > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amt));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}